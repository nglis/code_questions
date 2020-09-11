package LinkedLists;

public class KthNodeFromEnd {

    public int solutionA(Node head, int k) {
        if (head == null) return 0;

        int i = solutionA(head.next, k) + 1;
        if (i == k) {
            System.out.println(head.data);
        }
        return i;
    }


    // Wrapper used for solution B
    class IntWrapper {
        public int value = 0;
    }

    public Node solutionB(Node head, int k, IntWrapper i) {
        if (head == null) return null;

        Node node = solutionB(head.next, k, i);
        i.value = i.value + 1;
        if (i.value == k){
            return head;
        }
        return node;
    }

    public Node kToLast(Node head, int k) {
        if (head == null) return head;

        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        if (k < count) return null;

        int index = count - k;
        count = 1;
        temp = head;
        while (count < index) {
            temp = temp.next;
            count++;
        }
        return temp;
    }

}
