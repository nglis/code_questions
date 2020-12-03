package OOP.CallCenter.Alternative;

public class Call {
    private Rank rank;

    private Caller caller;

    private Employee handle;

    public Call(caller c) {
        rank = Rank.responder;
        caller = c;
    }

    public void setHandler(Employee e) {
        handler = e;
    }

    public void reply(String message) {
        // Implement reply
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank r) {
        rank = r;
    }

    public Rank incrementRank() {
        // Implement incrememtRank
    }

    public void disconnect() {
        // Implement disconnect
    }
}
