package LinkedLists;

public class Node {
    int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
    }

    void addToTail(int data) {
        Node temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

}
