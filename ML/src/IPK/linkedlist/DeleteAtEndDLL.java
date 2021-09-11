package IPK.linkedlist;

public class DeleteAtEndDLL {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        DLNode dlNode = null;
        for (int key : array) {
            dlNode = ReverseDLL.push(dlNode, key);
        }
        CreateAndPrintDLL.print(deleteEnd(dlNode));
    }

    private static DLNode deleteEnd(DLNode dlNode) {
        if (dlNode == null || dlNode.getNext() == null) return null;
        DLNode current = dlNode;
        while (current.getNext().getNext() != null) {
            current =current.getNext();
        }
        current.setNext(null);
        return dlNode;
    }

}
