package IPK.linkedlist;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        SLNode slNode = new SLNode(10);
        slNode.setNext(new SLNode(5));
        slNode.getNext().setNext(new SLNode(20));
        slNode.getNext().getNext().setNext(new SLNode(15));
        slNode.getNext().getNext().getNext().setNext(new SLNode(25));
        slNode.getNext().getNext().getNext().getNext().setNext(new SLNode(30));
        middle(slNode);
    }

    public static void middle(SLNode slNode) {
        if (slNode == null) {
            System.out.println("Node empty couldn't find middle");
            return;
        }
        if (slNode.getNext() == null) {
            System.out.println(slNode.getValue());
            return;
        }
        SLNode slow = slNode;
        SLNode fast = slNode;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        System.out.println(slow.getValue());
    }
}
