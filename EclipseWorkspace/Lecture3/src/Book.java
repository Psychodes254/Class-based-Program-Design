import tester.*;

/*
  +---------------+
  | Book          | 
  +---------------+
  | String title  |
  | String author |
  | int price     | 
  +---------------+  
*/


// to represent a book in a bookstore
class Book {
    String title;
    Author author;
    int price;

    // the constructor
    Book(String title, Author author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /* TEMPLATE:
       Fields:
       ... this.title ...         -- String
       ... this.author ...        -- String
       ... this.price ...         -- int
       
       Methods:
       ... this.salePrice(int) ...   -- int
       ... this.sameAuthor(Book) ... -- boolean
       ... this.reducePrice() ...    -- Book
    */

    // Compute the sale price of this Book given using 
    // the given discount rate (as a percentage)
    int salePrice(int discount) {
        return this.price - (this.price * discount) / 100;
    }
    
    // is this book written by the same Author as the given book?
    boolean sameAuthor(Book that) {
      return this.author.sameAuthor(that.author);
    }
    
    // In Book 
    // produce a book like this one, but with a discount of 20%
    Book reducePrice() {
      return new Book(this.title, this.author, this.salePrice(20));
    }
}

// to represent an author of a book in a bookstore
class Author {
  String name;
  int yob;
  
  // the constructor
  Author(String name, int yob) {
    this.name = name;
    this.yob = yob;
  }
    /* TEMPLATE
    Fields:
    ... this.name ...    -- String
    ... this.yob ...     -- int

    Methods:
    ... this.sameAuthor(Author) ... -- boolean
  */
    
    // is this the same author as given one?
    boolean sameAuthor(Author that) {
      return this.name.equals(that.name) &&
             this.yob == that.yob;
    }
  }
  
  
// examples and tests for the classes that represent
// books and authors
class ExamplesBooks {
    ExamplesBooks() {}
    
    // examples of authors
    Author pat = new Author("Pat Conroy", 1948);
    Author dan = new Author("Dan Brown", 1962);
    Author justus = new Author("Justus Nduku", 1998);

    // examples of books
    Book htdp = new Book("HtDP", this.pat, 60);
    Book beaches = new Book("Beaches", this.dan, 20);
    Book villain = new Book("Villain", this.justus, 80);
    Book cbpd = new Book("CPBD", this.pat, 75);
    Book psycho = new Book("Psycho", this.justus, 90);

    // test the method salePrice for the class Book
    boolean testSalePrice(Tester t) {
        return t.checkExpect(this.htdp.salePrice(30), 42)
            && t.checkExpect(this.beaches.salePrice(20), 16)
            && t.checkExpect(this.villain.salePrice(10), 72);
    }
        
    // test the method sameAuthor for the class Book
    boolean testSameBookAuthor(Tester t) {
      return t.checkExpect(this.htdp.sameAuthor(this.cbpd), true) &&
             t.checkExpect(this.beaches.sameAuthor(this.villain), false) &&
             t.checkExpect(this.villain.sameAuthor(this.psycho), true);
    }
    
    // test the method reducPrice for the class Book
    boolean testReducePrice(Tester t) {
      return t.checkExpect(this.htdp.reducePrice(), 
                           new Book("HtDP", this.pat, 48)) &&
             t.checkExpect(this.beaches.reducePrice(), 
                           new Book("Beaches", this.dan, 16)) &&
             t.checkExpect(this.villain.reducePrice(), 
                 new Book("Villain", this.justus, 64)) &&
             t.checkExpect(this.cbpd.reducePrice(), 
                 new Book("CPBD", this.pat, 60)) &&
             t.checkExpect(this.psycho.reducePrice(), 
                 new Book("Psycho", this.justus, 72));
    }

    }
