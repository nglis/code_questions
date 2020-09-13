package LinkedLists;

public class ListAddition {

    // Solution
    LinkedListNode addLists (LinkedListNode l1, LinkedListNode l2, int carry) {

        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        LinkedListNode result = new LinkedListNode(carry, null, null);

        int value = carry;
        if (l1 != null) {
            value += l1.data;
        }
        if (l2 != null) {
            value += l2.data;
        }

        result.data = value % 10;

        if (l1 != null || l2 != null) {
            LinkedListNode more = addLists (l1 == null ? null : l1.next, l2 != null ? null l2.next, value >= 10 ? 1 : 0);

            result.setNext(more);
        }

        return result;
    }

    public LinkedList ReverseAdd (LinkedList list1, LinkedList list2) {

        int val1 = getValList(list1);
        int val2 = getValList(list2);
        int total = val1 + val2;
        LinkedList newList;

        while (total > 0) {
            int digit = total % 10;
            total /= 10;
            newList.addNode(digit)''
        }

        return newList;
    }

    public int getValList(LinkedList list) {
        int count = 1;
        int total = 0;
        Node head = list.head;

        while (head != null) {
            total += head.data * count;
            count *= 10;
            head = head.next;
        }

        return total;
    }

}
