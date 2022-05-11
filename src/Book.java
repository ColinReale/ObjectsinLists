public class Book {

    private String bookName;
    private int bookPages;
    private int bookYear;

    public Book(String bookName, int bookPages, int bookYear) {
        this.bookName = bookName;
        this.bookPages = bookPages;
        this.bookYear = bookYear;
    }

    //    getters
    public String getBook() {
        return bookName;
    }

    public int getPages() {
        return bookPages;
    }

    public int getYear() {
        return bookYear;
    }

    public String toString() {
        return getBook() + ", " + getPages() + " pages, " + getYear();

    }
}
