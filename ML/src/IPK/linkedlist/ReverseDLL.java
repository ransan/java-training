package IPK.linkedlist;

public class ReverseDLL {
    public static void main(String[] args) {
        /**
        DLNode head = new DLNode(10);
        DLNode node_1 = new DLNode(20);
        DLNode node_2 = new DLNode(30);
        head.setNext(node_1);
        head.setPrevious(null);
        node_1.setNext(node_2);
        node_1.setPrevious(head);
        node_2.setNext(null);
        node_2.setPrevious(node_1);
         **/
        int[] array = {50 , 10, 20, 30, 40};
        DLNode head = null;
        for (int key : array) {
            head = push(head, key);
        }
        CreateAndPrintDLL.print(reverse(head));
    }

    private static DLNode reverse(DLNode dlNode) {
        if (dlNode == null || dlNode.getNext() == null) return dlNode;
        DLNode temp = null;
        DLNode current = dlNode;
        while (current != null) {
            temp = current.getPrevious();
            current.setPrevious(current.getNext());
            current.setNext(temp);
            current = current.getPrevious();
        }
        return temp.getPrevious();
    }

    public static DLNode push(DLNode head, int key){
        DLNode newNode = new DLNode(key);
        if (head == null ) return newNode;
        DLNode current = head;
        while (current.getNext() !=null) {
            current = current.getNext();
        }

        current.setNext(newNode);
        newNode.setPrevious(current);

        return head;
    }
}
