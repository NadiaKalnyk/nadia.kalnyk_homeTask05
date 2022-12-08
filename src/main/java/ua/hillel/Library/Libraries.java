package ua.hillel.Library;

public class Libraries {
    public static Book scanner;

    public static void main (String[] agr) {
        Book book1 = new Book("book1", "bookAuthor1","History");
        Book book2 = new Book("book2", "bookAuthor2","Mystery");
        Book book3 = new Book("book3", "bookAuthor3","Romance");
        Book book4 = new Book("book4", "bookAuthor4","Health");
        Book book5 = new Book("book5", "bookAuthor1","Health");
        Book book6 = new Book("book6", "bookAuthor3","Romance");
        Book book7 = new Book("book7", "bookAuthor2","Mystery");
        Book book8 = new Book("book8", "bookAuthor2","Mystery");
        Book book9 = new Book("book9", "bookAuthor2","Mystery");

        String bookName = "bookAuthor1"; // метод "знайти книгу у бібліотеці"
        if (bookName == "bookAuthor1") {
            System.out.println("Your book: " + book1 + ";" + book5);
            if (bookName == "bookAuthor2") {
                System.out.println("Your book: " + book2 + ";" + book7 + ";"+ book8 + ";" + book9);
                if (bookName == "bookAuthor3") {
                    System.out.println("Your book: " + book3 + ";" + book6);
                    if (bookName == "bookAuthor4") {
                        System.out.println("Your book: " + book4);
                    }
                } else {
                    System.out.println("Book is not found");
                }
            }
        }
    }
}
