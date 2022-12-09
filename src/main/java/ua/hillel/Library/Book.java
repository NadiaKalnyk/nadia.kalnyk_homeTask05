package ua.hillel.Library;

public class Book {
    private String bookName;
    private String bookCategory ;
    private String bookAuthor;

    public Book (String bookName, String bookAuthor, String bookCategory) { // конструктор
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
    }

    public String getBookName() {
        return bookName;
    } // отримання значення з private String bookName;

    public String getBookCategory() {
        return bookCategory;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    @Override public String toString() {
        return "Name: " + this.bookName+ ", author: " + this.bookAuthor + ", category: " + this.bookCategory;
    }
}
