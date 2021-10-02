package IPK.linkedlist;

public class NthNodeFromEndOfSLL {
    public static void main(String[] args) {
        SLNode slNode = new SLNode(10);
        slNode.setNext(new SLNode(20));
        find(slNode, 3);
        findWayTwo(slNode, 3);
    }

    private static void find(SLNode slNode, int x) {
        if (slNode == null) {
            System.out.println("Node empty");
            return;
        }
        SLNode first = slNode;
        SLNode second = slNode;
        for (int i = 0; i < x; i++) {
            if (first == null) {
                return;
            }

            first = first.getNext();
        }

        while (first != null) {
            first = first.getNext();
            second = second.getNext();
        }
        if (second == null) {
            System.out.println("");
        }
        System.out.println(second.getValue());
    }

    private static void findWayTwo(SLNode slNode, int x) {
        if (slNode == null) return;
        int length = 0;
        for (SLNode i = slNode; i != null; i = i.getNext()) {
            length += 1;
        }
        if (length < x) return;
        SLNode current = slNode;
        for (int i = 1; i < length - x + 1; i++) {
            current = current.getNext();
        }

        System.out.println(current.getValue());
    }
}
