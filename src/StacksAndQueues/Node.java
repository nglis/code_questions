package StacksAndQueues;

public class Node {
    Object data;
    Node next = null;

    public Node(Object data) {
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
