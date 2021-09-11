package IPK.linkedlist;

public class DeleteAtPositionDLL {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        DLNode dlNode = null;
        for (int key : array) {
            dlNode = ReverseDLL.push(dlNode, key);
        }
        CreateAndPrintDLL.print(delete(dlNode, 4));
    }

    private static DLNode delete(DLNode dlNode, int pos) {
        if (dlNode == null) return null;
        if (pos == 1) return dlNode.getNext();
        DLNode current = dlNode;
        for (int i=1;i <= pos-2 && dlNode.getNext() != null; i++) {
            current = current.getNext();
        }
        if (current == null) return dlNode;
        current.getNext().setPrevious(current);
        current.setNext(current.getNext().getNext());
        return dlNode;
    }
}
