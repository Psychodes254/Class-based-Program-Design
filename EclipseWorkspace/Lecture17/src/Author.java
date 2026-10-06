class Author{
    String first;
    String last;
    int yob;
    IList<Book> books;

    Author(String first, String last, int yob){
        this.first = first;
        this.last = last;
        this.yob = yob;
        this.books = new MtList<Book>();
    }

    boolean sameAuthor(Author other){
        return this.first.equals(other.first) &&
               this.last.equals(other.last) &&
               this.yob == other.yob;
    }
    
    void addBook(Book b) {
        if (!b.author.sameAuthor(this)){
            throw new RuntimeException("Book was not written by this author!");
        }
        else{
            this.books = new ConsList<Book>(b, this.books);
        }
    }
}