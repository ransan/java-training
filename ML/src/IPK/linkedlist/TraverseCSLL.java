package IPK.linkedlist;

public class TraverseCSLL {
    public static void main(String[] args) {
        SLNode slNode = new SLNode(10);
        slNode.setNext(new SLNode(20));
        slNode.getNext().setNext(new SLNode(30));
        slNode.getNext().getNext().setNext(slNode);
        printCSLL(slNode);
    }

    public static void printCSLL(SLNode slNode) {
        if (slNode == null) return;
        System.out.println(slNode.getValue());
        for (SLNode i = slNode.getNext(); i != slNode && i != null ; i = i.getNext()) {
            System.out.println(i.getValue());
        }
    }
}
