public class Main {
    public static void main(String[] args) {
        Author Lermontov = new Author("Михаил", "Лермонтов");
        Author Pushkin = new Author("Александр", "Пушкин");
        Book bookPushkin = new Book("Война и мир", Pushkin , 1937);
        System.out.println("nameBook = " + bookPushkin.getNameBook());
        System.out.println("nameAuthor = " + bookPushkin.getNameAuthor());
        System.out.println("PublicBook = " + bookPushkin.getPublicBook());
        bookPushkin.setPublicBook(1936);
        System.out.println("PublicBook = " + bookPushkin.getPublicBook());
        System.out.println();

        Book bookLermontov = new Book("Мцыри", Lermontov, 1840);
        System.out.println("nameBook = " + bookLermontov.getNameBook());
        System.out.println("nameAuthor = " + bookLermontov.getNameAuthor());
        System.out.println("PublicBook = " + bookLermontov.getPublicBook());
        bookLermontov.setPublicBook(1839);
        System.out.println("PublicBook = " + bookLermontov.getPublicBook());
        System.out.println();
        System.out.println("FirstName = " + Pushkin.getFirstName());
        System.out.println("MiddleName = " + Pushkin.getSurName());
        System.out.println();
        System.out.println("FirstName = " + Lermontov.getFirstName());
        System.out.println("MiddleName = " + Lermontov.getSurName());
    }
}
