package OOP.BookReader;

public class Library {
    private Book[] books;

    public Library(Book[] b) {
        books = b;
    }

    public Book searchByTitle(String t) {
        for (Book b : books)
            if (b.getTitle().equals(t))
                return b;

            return null;
    }
}
