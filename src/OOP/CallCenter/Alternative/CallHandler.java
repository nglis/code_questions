package OOP.CallCenter.Alternative;

public class CallHandler {
    private static CallHandler instance;

    private final int LEVELS = 3;

    private final int num_respondents = 10;
    private final int num_managers = 3;
    private final int num_directors = 2;

    List<List<Employee>> employeeLevels;

    List<List<Call>> callQueues;

    protected CallHandler() {
        // implement callHandler
    }

    public static CallHandler getInstance() {
        if (instance == null)
            instance = new CallHandler();

        return instance;
    }

    public Employee getHandlerForCall(Call call) {
        // implement getHandlerForCall
    }

    public void dispatchCall(Caller caller) {
        Call call = new Call(caller);
        dispatchCall(call);
    }

    public void dispatchCall(Call call) {
        Employee emp = getHandlerForCall(call);

        if (emp != null) {
            emp.receiveCall(call);
            call.setHandler(emp);
        } else {
            call.reply("Please wait for an employee to reply");
            callQueues.get(call.getRank().getValue()).add(call);
        }
    }

    public void assignCall(Employee emp) {
        // implement assignCall
    }
}
