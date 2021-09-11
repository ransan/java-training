package IPK.linkedlist;

public class InsertAtEndDLL {
    public static void main(String[] args) {
        DLNode dlNode = new DLNode(10);
        dlNode.setNext(new DLNode(20));
        dlNode.getNext().setNext(new DLNode(30));
        CreateAndPrintDLL.print(insertAtEnd(dlNode, 40));
    }

    public static DLNode insertAtEnd(DLNode dlNode, int value) {
        DLNode temp = new DLNode(value);
        if (dlNode == null) return temp;
        DLNode current = dlNode;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        temp.setPrevious(current);
        return dlNode;
    }
}
