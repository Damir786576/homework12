public class Book {
    private final String nameBook;
    private final Author nameAuthor;
    private int publicBook;

    public Book(String nameBook, Author nameAuthor, int publicBook) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.publicBook = publicBook;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public String getNameAuthor() {
        return nameAuthor.toString();
    }
    public int getPublicBook() {
        return this.publicBook;
    }

    public void setPublicBook(int publicBook) {
        this.publicBook = publicBook;
    }
}
