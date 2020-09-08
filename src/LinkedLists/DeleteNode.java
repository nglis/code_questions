package LinkedLists;

public class DeleteNode {

    public boolean solution(Node n) {
        if (n == null || n.next == null)
            return false;

        Node next = n.next;
        n.data = next.data;
        n.next = next.next;

        return true;
    }

    public void delete(Node n) {
        if (n == null) return;

        if (n.next == null) {
            n = null;
            return;
        }

        n.data = n.next.data;
        n.next = n.next.next;
    }

}
