package IPK.linkedlist;

public class SearchInLinkedList {
    public static void main(String[] args) {
        SLNode slNode = new SLNode(10);
        slNode.setNext(new SLNode(20));
        slNode.getNext().setNext(new SLNode(30));
        System.out.println(search(slNode, 30));
    }

    private static int search(SLNode head, int value) {
        if (head == null) return -1;
        int count = 0;
        SLNode current = head;
        if (current.getValue() == value) return 1;
        while (current.getNext() != null) {
            ++count;
            if (current.getValue() == value) return count;
            current = current.getNext();
        }
        if (current.getValue() == value) return count+1;
        return -1;
    }
}
