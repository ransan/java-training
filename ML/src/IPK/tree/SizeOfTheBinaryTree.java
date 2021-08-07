package IPK.tree;

public class SizeOfTheBinaryTree {
    private Node root;

    public SizeOfTheBinaryTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        final SizeOfTheBinaryTree tree = new SizeOfTheBinaryTree();
        tree.root = new Node(25);
        tree.root.setLeft(new Node(15));
        tree.root.setRight(new Node(50));
        int size = size(tree.root);
        System.out.println(size);
    }

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1+ size(root.getLeft()) + size(root.getRight());
    }
}
