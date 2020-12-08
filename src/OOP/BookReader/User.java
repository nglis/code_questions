package OOP.BookReader;

public class User {
    private int id;
    private boolean member;
    private Date membershipExpires;
    private Book activeBook;

    public User(int idnum, boolean m, Date expires, Book a) {
        id = idnum;
        member = m;
        membershipExpires = expires;
        activeBook = a;
    }

    public boolean isMember() {
        return member;
    }

    public void activateMembership(boolean m) {
        member = m;
    }

    public void deactivateMembership() {
        member = false;
    }

    public void extendMembership(Date d) {
        membershipExpires = d;
    }

    public boolean membershipExpired() {
        if todays date > membershipExpires {
            deactivateMembership();
            return true;
        } else {
            return false;
        }
    }

    public Book getActiveBook() {
        return activeBook;
    }

    public void setActiveBook(Book b) {
        activeBook = b;
    }

    public void readBook() {
        // Implement readBook
    }

}
