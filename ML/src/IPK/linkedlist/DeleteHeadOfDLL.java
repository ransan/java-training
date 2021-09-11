package IPK.linkedlist;

public class DeleteHeadOfDLL {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        DLNode dlNode = null;
        for (int key : array) {
            dlNode = ReverseDLL.push(dlNode, key);
        }
        CreateAndPrintDLL.print(deleteHead(dlNode));
    }

    private static DLNode deleteHead(DLNode dlNode) {
        if (dlNode == null) return null;
        return dlNode.getNext();
    }
}
