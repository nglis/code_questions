package LinkedLists;

public class PartitionAroundValue {

    public Node solution (Node node, int x) {
        Node beforeStart = null;
        Node afterStart = null;
        Node beforeEnd = null;
        Node afterEnd = null;

        while (node != null) {
            Node next = node.next;
            node.next = null;
            if (node.data < x) {
                if (beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            } else {
                if (afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = next;
        }

        if (beforeStart == null) return afterStart;

        beforeEnd.next = afterStart;
        return beforeStart;
    }

    public void partition (Node head, int val) {
        if (head == null) return;

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        while (head.data < val) {
            tail.next = head;
            tail = tail.next;
            head = head.next;
            tail.next = null;
        }

        Node prev = head;
        Node cur = head.next;

        while (cur != null) {
            Node next = cur.next;

            if (cur.data < val) {
                cur.next = head;
                head = cur;
                prev.next = head;
            } else if (cur.data > val) {
                tail.next = cur;
                tail = tail.next;
                prev.next = next;
            }

            prev = cur;
            cur = next;
        }
    }
}
