package IPK.linkedlist;

public class InsertInSortedSLL {
    public static void main(String[] args) {
        SLNode slNode = new SLNode(10);
        slNode.setNext(new SLNode(20));
        slNode.getNext().setNext(new SLNode(30));
        TraverseCSLL.printCSLL(sortedInsert(slNode, 45));
    }

    private static SLNode sortedInsert(SLNode slNode, int x){
        SLNode temp = new SLNode(x);
        if (slNode == null) {
            return temp;
        }
        if (slNode.getValue() > x) {
            temp.setNext(slNode);
            return temp;
        }

        SLNode current = slNode;
        while (current.getNext() != null && current.getNext().getValue() < x ) {
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        return slNode;
    }
}
