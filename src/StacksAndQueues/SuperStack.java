package StacksAndQueues;

import java.util.Hashtable;

public class SuperStack {
    int maxStackSize = 100;

    int currentStackId = 0;
    int currentStackCount = 0;

    Hashtable<Integer, Stack> tbl = new Hashtable<>();

    public void push(int data) {
        if (currentStackCount == 99) {
            currentStackId ++;
            currentStackCount = 0;
            if (tbl.get(currentStackId) == null)
                tbl.put(currentStackId, new Stack());

            tbl.get(currentStackId).push(data);
        }
    }

    public int pop() {
        if (isEmpty())
            return Integer.MAX_VALUE;

        int data = (Integer) tbl.get(currentStackId).pop();
        currentStackCount --;

        if (currentStackCount == -1) {
            currentStackId --;
            currentStackCount = 0;
        }

        return data;
    }

    public boolean isEmpty() {
        return currentStackCount == 0 && currentStackId == 0;
    }

}
