package OOP.BookReader.Alternative;

public class Book {
    private int bookId;
    private String details;

    public Book(int id, String det) {
        bookId = id;
        details = det;
    }

    public int getID() {
        return bookid;
    }

    public void setID(int id) {
        bookId = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String det) {
        details = det;
    }
}
