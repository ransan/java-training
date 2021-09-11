package IPK.linkedlist;

public class InsertAtAnyPositionDLL {
    public static void main(String[] args) {
        DLNode dlNode = new DLNode(10);
        dlNode.setNext(new DLNode(20));
        dlNode.getNext().setNext(new DLNode(30));
        CreateAndPrintDLL.print(insert(dlNode, 3, 15));
    }

    private static DLNode insert(DLNode dlNode, int pos, int value) {
        if (dlNode == null) return null;
        DLNode temp = new DLNode(value);
        if (pos == 1) return temp;

        DLNode current = dlNode;
        for (int i=1; i<=pos-2 && current != null; i++) {
            current = current.getNext();
        }
        if (current == null) return dlNode;
        temp.setNext(current.getNext());
        current.getNext().setPrevious(temp);
        temp.setPrevious(current);
        current.setNext(temp);
        return dlNode;
    }
}
