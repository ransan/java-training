package IPK.tree;

public class PrintNodeAtDistanceK {
    private Node root;

    public PrintNodeAtDistanceK() {
        this.root = null;
    }

    public static void main(String[] args) {
        PrintNodeAtDistanceK tree = new PrintNodeAtDistanceK();
        tree.root = new Node(10);
        tree.root.setLeft(new Node(20));
        tree.root.getLeft().setLeft(new Node(40));
        tree.root.getLeft().setRight(new Node(50));
        tree.root.setRight(new Node(30));
        tree.root.getRight().setRight(new Node(70));
        tree.root.getRight().getRight().setRight(new Node(80));
        printNode(tree.root, 2);
    }

    public static void printNode(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.println(root.getValue() + " ");
        }

        printNode(root.getLeft(), k-1);
        printNode(root.getRight(), k-1);
    }
}
