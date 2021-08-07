package IPK.tree;

public class PrintRightViewOfTree {
    private static int maxValue = 0;
    private Node root;

    public PrintRightViewOfTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        final PrintRightViewOfTree tree = new PrintRightViewOfTree();
        tree.root = new Node(4);
        tree.root.setLeft(new Node(5));
        tree.root.setRight(new Node(2));
        tree.root.getRight().setLeft(new Node(3));
        tree.root.getRight().setRight(new Node(1));
        tree.root.getRight().getLeft().setLeft(new Node(6));
        tree.root.getRight().getLeft().setRight(new Node(7));
        rightView(tree.root, 1);
    }

    public static void rightView(Node root, int level) {
        if (root == null) return;
        if (maxValue < level) {
            System.out.println(root.getValue());
            maxValue = level;
        }
        rightView(root.getRight(), level + 1);
        rightView(root.getLeft(), level + 1);
    }
}

