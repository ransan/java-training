package IPK.linkedlist;

public class InsertAtBeginCSLL {
    public static void main(String[] args) {
        SLNode slNode = new SLNode(10);
        slNode.setNext(new SLNode(20));
        slNode.getNext().setNext(new SLNode(30));
        slNode.getNext().getNext().setNext(new SLNode(40));
        TraverseCSLL.printCSLL(insertAtBegin(slNode, 5));
    }

    private static SLNode insertAtBegin(SLNode slNode, int x) {
        SLNode temp = new SLNode(x);
        if (slNode == null) {
            temp.setNext(temp);
            return temp;
        }

        if (slNode.getNext() == slNode) {
            temp.setNext(slNode);
            slNode.setNext(temp);
            return temp;
        }

        temp.setNext(slNode.getNext());
        slNode.setNext(temp);
        int headval = slNode.getValue();
        slNode.getNext().setValue(headval);
        slNode.setValue(x);
        return slNode;
    }
}
