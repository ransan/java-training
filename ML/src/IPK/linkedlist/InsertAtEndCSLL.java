package IPK.linkedlist;

public class InsertAtEndCSLL {
    public static void main(String[] args) {
        SLNode slNode = new SLNode(10);
        slNode.setNext(slNode);
        slNode.setNext(new SLNode(20));
        slNode.getNext().setNext(new SLNode(30));
        slNode.getNext().getNext().setNext(new SLNode(40));
        slNode.getNext().getNext().getNext().setNext(slNode);
        TraverseCSLL.printCSLL(insertAtEnd(slNode, 50));
    }

    public static SLNode insertAtEnd(SLNode slNode, int x) {
        SLNode temp = new SLNode(x);
        if (slNode == null) {
            temp.setNext(temp);
            return temp;
        }

        if (slNode.getNext() == slNode) {
            slNode.setNext(temp);
            temp.setNext(slNode);
            return slNode;
        }

        temp.setNext(slNode.getNext());
        slNode.setNext(temp);
        int currVal = slNode.getValue();
        slNode.getNext().setValue(currVal);
        slNode.setValue(x);
        return slNode.getNext();
    }
}
