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
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        boolean isnameBook = nameBook.equals(book.nameBook);
        boolean isnameAuthor = nameAuthor.equals(book.nameAuthor);
        boolean ispublicBook = publicBook == book.publicBook;
        return ispublicBook && isnameBook && isnameAuthor;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook, nameAuthor, publicBook);
    }
    @Override
    public String toString() {
        return nameBook + " " + nameAuthor + " " + publicBook;
    }
}
