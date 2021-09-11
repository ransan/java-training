package IPK.linkedlist;

public class InsertAtBeginDLL {
    public static void main(String[] args) {
        DLNode dlNode = new DLNode(10);
        dlNode.setNext(new DLNode(20));
        dlNode.getNext().setNext(new DLNode(30));
        CreateAndPrintDLL.print(insertAtBegin(dlNode, 5));
    }
    public static DLNode insertAtBegin(DLNode dlNode, int value) {
        if (dlNode == null) new DLNode(value);
        DLNode temp = new DLNode(value);
        dlNode.setPrevious(temp);
        temp.setNext(dlNode);
        return temp;
    }
}
