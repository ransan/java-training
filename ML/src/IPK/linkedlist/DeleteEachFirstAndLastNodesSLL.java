package IPK.linkedlist;

public class DeleteEachFirstAndLastNodesSLL {
    public static void main(String[] args) {
        SLNode head = new SLNode(10);
        head.setNext(new SLNode(20));
        head.getNext().setNext(new SLNode(70));
        head.getNext().getNext().setNext(new SLNode(85));
        int sum = sumOfFirstAndLast(head, 0);
        System.out.println(sum);
    }

    private static int sumOfFirstAndLast(SLNode head, int sum) {
        if (head == null) return sum;

        while (head != null) {
            SLNode first = findFirst(head);
            SLNode last = findLast(head);
            if (first != null && last != null) {
                sum = Math.max(sum, (first.getValue() + last.getValue()));
            }
            SLNode slNode = removeFirst(head);
            head = slNode;
            SLNode lastRemoved = removeLast(head);
            head = lastRemoved;
        }
        return sum;
    }

    private static SLNode findFirst(SLNode head) {
        return head;
    }

    private static SLNode findLast(SLNode head) {
        if (head == null) return null;
        SLNode current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    private static SLNode removeFirst(SLNode head) {
        if (head == null) return null;
        return head.getNext();
    }

    private static SLNode removeLast(SLNode head) {
        if (head == null) return null;
        if (head.getNext() == null) return null;
        SLNode current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        return head;
    }
}
