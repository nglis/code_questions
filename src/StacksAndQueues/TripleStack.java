package StacksAndQueues;

public class TripleStack {

    int stackSize = 100;
    int[] arr = new int[stackSize * 3];
    int[] stackTops = { -1, -1, -1 };

    // We will denote the stacks using values 0, 1, 2
    public void push(int data, int stack) {
        if (stackTops[stack] >= stackSize - 1)
            return; // Stack overflown

        stackTops[stack]++;
        arr[getTopIndex(stack)] = data;
    }

    public int pop(int stack) {
        if (stackTops[stack] < 0)
            return -1;

        int data = arr[getTopIndex(stack)];
        arr[getTopIndex(stack)] = 0;
        stackTops[stack]--;
        return data;
    }

    public int peek(int stack) {
        if (stackTops[stack] < 0)
            return -1;

        return arr[getTopIndex(stack)];
    }

    public int getTopIndex(int stack) {
        return stack * stackSize + stackTops[stack];
    }

}
