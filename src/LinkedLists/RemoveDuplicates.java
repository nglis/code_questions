package LinkedLists;

import java.util.Hashtable;

public class RemoveDuplicates {

    public void solutionA(Node head) {
        Hashtable table = new Hashtable<>();
        Node previous = null;

        while (head != null) {
            if(table.containsKey(head.data)) {
                previous.next = head.next;
            } else {
                table.put(head.data, true);
                previous = head;
            }
            head = head.next;
        }
    }

    public void solutionB(Node head) {
        // Solution without using a temporary buffer
        if (head == null) return;

        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public void removeDuplicates(Node head) {
        // A few minor mistakes here
        if (head == null) return;

        boolean[] b = new boolean[Integer.MAX_VALUE];
        Node temp = head;
        while (temp.next != null) {
            if(b[temp.data]) {
                temp.next = temp.next.next;
            }
            b[temp.data] = true;
            temp = temp.next;
        }
    }

    public void removeDuplicates2(Node head) {
        // A few minor mistakes here
        Node temp = head;
        while (temp.next != null) {
            Node temp2 = temp.next;
            while (temp2.next != null) {
                if (temp2.data == temp.data) {
                    temp2.next = temp2.next.next;
                }
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
    }

}
