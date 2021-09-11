package IPK.linkedlist;

public class CreateAndPrintDLL {
    public static void main(String[] args) {
        DLNode dlNode = new DLNode(10);
        dlNode.setNext(new DLNode(20));
        dlNode.getNext().setNext(new DLNode(30));
        print(dlNode);
    }

    public static void print(DLNode head) {
        if (head == null) return;
        System.out.println(head.getValue());
        print(head.getNext());
    }
}
