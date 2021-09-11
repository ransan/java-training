package IPK.linkedlist;

public class CreateAndPrintSLL {
    public static void main(String[] args) {
        SLNode head = new SLNode(10);
        head.setNext(new SLNode(20));;
        head.getNext().setNext(new SLNode(30));
        printLL(head);
        print(head);
    }
    public static void printLL(SLNode head) {
        if (head == null) return;
        System.out.println(head.getValue());
        printLL(head.getNext());
    }

    public static void print(SLNode head) {
        SLNode current = head;
        while (current != null) {
            System.out.println("* "+ current.getValue());
            current = current.getNext();
        }
    }
}
