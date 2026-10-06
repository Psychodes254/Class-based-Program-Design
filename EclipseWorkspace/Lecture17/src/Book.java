import tester.*;

class Book{
    String title;
    int price;
    int quantity;
    Author author;

    Book(String title, int price, int quantity, Author author){
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.author = author;
        this.author.addBook(this);
    }

    boolean sameBook(Book other){
        return
        this.title.equals(other.title) &&
        this.price == other.price &&
        this.quantity == other.quantity &&
        this.author == other.author;
    }
}

class ExamplesBooks{
    ExamplesBooks(){}

    Author james, jkRowling;
    Book atomic, hp1, hp2;

    IList<Book> mt = new MtList<Book>();
    
    void initialConditions() {
      this.james = new Author("James", "Clear", 1986);
      this.jkRowling = new Author("Jk", "Rowling", 1965);
      this.atomic = new Book("Atomic Habits", 20, 1, james);
      this.hp1 = new Book("Harry Potter", 15, 1, jkRowling);
      this.hp2 = new Book("Harry Potter2", 17, 1, jkRowling);
    }

    void testSameBook(Tester t){
      initialConditions();
      t.checkExpect(this.james.books, new ConsList<Book>(atomic, mt));
      t.checkExpect(this.jkRowling.books, new ConsList<Book>(hp2, new ConsList<Book>(hp1, mt)));
      
    }

    void testBookAuthors(Tester t){
     initialConditions();
     t.checkException(new RuntimeException("Book was not written by this author!"),
         this.jkRowling, "addBook", this.atomic);
    }
} 