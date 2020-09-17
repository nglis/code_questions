package StacksAndQueues;

public class StackWithMin {
    class Solution extends Stack {
        Stack s2;

        public Solution() {
            s2 = new Stack();
        }

        public void push(int data) {
            if (data <= min())
                s2.push(data);
            super.push(data);
        }

        public Integer pop() {
            int value = (Integer) super.pop();
            if (value == min())
                s2.pop();
            return value;
        }

        public Integer min() {
            if (s2.isEmpty()) {
                return Integer.MAX_VALUE;
            } else {
                return (Integer) s2.peek();
            }
        }
    }

    class attempt {
        Node top;
        Stack min = new Stack();

        void push(Integer data) {
            if (min.peek() == null || (Integer) min.peek() >= data)
                min.push(data);
            Node temp = new Node(data);
            temp.next = top;
            top = temp;
        }

        int pop() {
            if (min.peek() == top.data)
                min.pop();
            int data = (Integer) top.data;
            top = top.next;
            return data;
        }

        int min() {
            return (Integer) min.peek();
        }
    }
}
