package LinkedLists;

import java.util.Hashtable;

public class FindLoopNode {

    public Node solution(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }

    public Node brute2(Node head) {
        Hashtable<Node, Boolean> table = new Hashtable<Node, Boolean>();

        while (head != null) {
            if (table.get(head)) {
                return head;
            }

            table.put(head, true);
            head = head.next;
        }

        return null;
    }

    public boolean isNodeInList(Node head, Node node) {
        while (head != null) {
            if (head == node)
                return true;

            head = head.next;
        }
        return false;
    }

    public Node brute(Node head) {
        // O(n^2) time, O(1) space
        if (head == null)
            return head;

        while (head != null) {
            if (isNodeInList(head.next, head))
                return head;

            head = head.next;
        }

        return null;
    }

}
