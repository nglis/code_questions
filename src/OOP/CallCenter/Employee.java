package OOP.CallCenter;

public abstract class Employee {
    private boolean busy;
    private String rank;

    public void setRank(String r) { rank = r; }
    public String getRank() { return rank; }

    public void setBusy(boolean b) { busy = b; }
    public boolean isBusy() { return busy; }

}
