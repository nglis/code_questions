package OOP.CallCenter;

import java.util.ArrayList;

public class CallCenter <T extends Employee> {
    private ArrayList<T> respondents;
    private ArrayList<T> managers;
    private ArrayList<T> directors;

    public void setEmployees(ArrayList<T> r, ArrayList<T> m, ArrayList<T> d) {
        respondents = r;
        managers = m;
        directors = d;
    }

    public void dispatchCall() {
        // TODO implement dispatch call
    }
}
