package StacksAndQueues;

// Implement a queue using two stacks. First attempt implementation

public class StacksAsQueue {
    Stack reversed = new Stack();
    Stack ordered = new Stack();

    boolean inOrder = false;

    public void enqueue(int d) {
        if (inOrder) {
            while (!ordered.isEmpty())
                reversed.push(ordered.pop());

            inOrder = false;
        }
        reversed.push(d);
    }

    public int dequeue() {
        if (inOrder && !ordered.isEmpty())
            return (Integer) ordered.pop();
        else if (inOrder && ordered.isEmpty())
            return -1;
        else {
            while (!reversed.isEmpty())
                ordered.push(reversed.pop());

            inOrder = true;
        }

        if (ordered.isEmpty())
            return (Integer) ordered.pop();

        return -1;
    }
}

/* Solution - Shifts stacks only when all items have been popped from the ordered stack

public class StacksAsQueue {
    Stack newestStack;
    Stack oldestStack;

    public StacksAsQueue() {
        newestStack = new Stack();
        oldestStack = new Stack();
    }

    public void enqueue(int d) {
        newestStack.push(d);
    }

    public void shiftStack() {
        if (oldestStack.isEmpty())
            while (!newestStack.isEmpty())
                oldestStack.push(newestStack.pop());
    }

    public int dequeue() {
        shiftStack();
        return newestStack.pop();
    }
}

 */