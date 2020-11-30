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

    public void dispatchCall(Object call) {
        T receiver = null;

        while (receiver == null) {
                receiver = getAvailableReceiver(respondents);
            if (receiver == null)
                receiver = getAvailableReceiver(managers);
            if (receiver == null)
                receiver = getAvailableReceiver(directors);
        }

        if (receiver != null)
            receiver.receiveCall(call);

    }

    private T getAvailableReceiver(ArrayList<T> receivers) {
        for (T r : receivers)
            if (!r.isBusy())
                return r;

        return null;
    }
}
