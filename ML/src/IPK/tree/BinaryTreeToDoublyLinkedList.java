package IPK.tree;

public class BinaryTreeToDoublyLinkedList {
    private Node root;
    private static Node previous =  null;

    public static void main(String[] args) {
        BinaryTreeToDoublyLinkedList tree = new BinaryTreeToDoublyLinkedList();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(30);
        tree.root.right.right = new Node(35);
        Node node = treeToDLL(tree.root);
        Node curr = node;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.right;
        }
    }

    private static Node treeToDLL(Node root) {
        if (root == null) return root;
        Node head = treeToDLL(root.getLeft());
        if (previous == null) {
            head = root;
        } else {
            root.left = previous;
            previous.right = root;
        }
        previous = root;
        treeToDLL(root.right);
        return head;
    }
}
