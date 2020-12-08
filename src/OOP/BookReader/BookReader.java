package OOP.BookReader;

public class BookReader {
    private User activeUser;
    private Library library;

    public BookReader(Book[] books) {
        library = new Library(books);
    }

    public void setActiveUser(User u) {
        activeUser = u;
    }

    public void removeActiveUser() {
        activeUser = null;
    }

}
