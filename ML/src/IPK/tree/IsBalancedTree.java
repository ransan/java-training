package IPK.tree;

public class IsBalancedTree {
    private Node root;

    public IsBalancedTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        IsBalancedTree tree = new IsBalancedTree();
        tree.root = new Node(25);
        tree.root.setLeft(new Node(15));
        tree.root.getLeft().setLeft(new Node(10));
        tree.root.getLeft().getLeft().setLeft(new Node(4));
        tree.root.getLeft().getLeft().setRight(new Node(12));
        tree.root.getLeft().setRight(new Node(22));
        tree.root.getLeft().getRight().setLeft(new Node(18));
        tree.root.getLeft().getRight().setRight(new Node(24));

        tree.root.setRight(new Node(50));
        tree.root.getRight().setLeft(new Node(35));
        tree.root.getRight().getLeft().setLeft(new Node(31));
        tree.root.getRight().getLeft().setRight(new Node(44));
        tree.root.getRight().setRight(new Node(70));
        tree.root.getRight().getRight().setLeft(new Node(66));
        tree.root.getRight().getRight().setRight(new Node(90));
        int size = isBalanced(tree.root);
        if (size == -1) System.out.println("Not Balanced " + size);
        else System.out.println("Balanced " + size);
    }

    private static int isBalanced(Node root) {
        if (root == null) return 0;
        int lh = isBalanced(root.getLeft());
        if (lh == -1) return -1;
        int rh = isBalanced(root.getRight());
        if (rh == -1) return -1;
        if (Math.abs(lh - rh) > 1) return -1;
        else return Math.max(lh, rh) + 1;
    }
}
