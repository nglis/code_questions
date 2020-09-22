package StacksAndQueues;

public class AscendingSort {
    // Using two stack only

    public Stack solution(Stack toSort) {
        Stack sorted = new Stack();
        while (!toSort.isEmpty()) {
            int tmp = toSort.pop();
            while (!sorted.isEmpty() && tmp < sorted.peek())
                toSort.push(sorted.pop());

            sorted.push(tmp);
        }

        return sorted;
    }

    public void sortStack(Stack toSort) {

        if (toSort.isEmpty())
            return;

        Stack aux = new Stack();

        while (!toSort.isEmpty()) {
            if (aux.isEmpty() || toSort.peek() <= aux.peek()) {
                aux.push(toSort.pop());
            } else {
                int tmp = toSort.pop();
                pushBack(toSort, aux);
                toSort.push(tmp);
            }
        }

        if (toSort.isEmpty())
            pushBack(toSort, aux);
    }

    public void pushBack(Stack to, Stack from) {
        while (!from.isEmpty())
            to.push(form.pop());
    }

}
