package OOP.BookReader.Alternative;

public class Display {
    private Book activeBook;
    private User activeUser;
    private int pageNumber = 0;

    public void displayUser(User user) {
        activeUser = user;
        refreshUsername();
    }

    public void displayBook(Book b) {
        pageNumber = 0;
        activeBook = b;

        refreshTitle();
        refreshDetails();
        refreshPage();
    }

    public void turnPageForward() {
        pageNumber++;
        refreshPage();
    }

    public void turnPageBackward() {
        pageNumber--;
        refreshPage();
    }

    public void refreshUsername() {
        // Update username display
    }

    public void refreshTitle() {
        // Update title display
    }

    public void refreshDetails() {
        // Update details display
    }

    public void refreshPage() {
        // Update page display
    }
}
