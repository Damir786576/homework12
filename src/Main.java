public class Main {
    public static void main(String[] args) {
        Book bookPushkin = new Book("Война и мир", "Аллександр С.П", 1937);
        System.out.println("nameBook = " + bookPushkin.getNameBook());
        System.out.println("nameAuthor = " + bookPushkin.getNameAuthor());
        System.out.println("PublicBook = " + bookPushkin.getPublicBook());
        bookPushkin.setPublicBook(1936);
        System.out.println("PublicBook = " + bookPushkin.getPublicBook());
        System.out.println();

        Book bookLermontov = new Book("Мцыри", "Михаил Ю.Л", 1840);
        System.out.println("nameBook = " + bookLermontov.getNameBook());
        System.out.println("nameAuthor = " + bookLermontov.getNameAuthor());
        System.out.println("PublicBook = " + bookLermontov.getPublicBook());
        bookLermontov.setPublicBook(1839);
        System.out.println("PublicBook = " + bookLermontov.getPublicBook());
        System.out.println();

        Author Pushkin = new Author("Александр", "Пушкин", "Сергеевич");
        System.out.println("FirstName = " + Pushkin.getFirstName());
        System.out.println("LastName = " + Pushkin.getLastName());
        System.out.println("MiddleName = " + Pushkin.getMiddleName());
        System.out.println();

        Author Lermontov = new Author("Михаил", "Лермонтов", "Юрьевич");
        System.out.println("FirstName = " + Lermontov.getFirstName());
        System.out.println("LastName = " + Lermontov.getLastName());
        System.out.println("MiddleName = " + Lermontov.getMiddleName());
    }
}
