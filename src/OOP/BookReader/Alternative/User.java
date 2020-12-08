package OOP.BookReader.Alternative;

public class User {
    private int userId;
    private String details;
    private int accountType;

    public void renewMembership() {
        // Implement renewMembership
    }

    public User(int id, String details, int accountType) {
        userId = id;
        this.details = details;
        this.accountType = accountType;
    }

    public int getId() {
        return userId;
    }

    public void setId(int id) {
        userId = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String det) {
        details = det;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int t) {
        accountType = t;
    }
}
