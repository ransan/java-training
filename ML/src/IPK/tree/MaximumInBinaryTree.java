package IPK.tree;

public class MaximumInBinaryTree {
    public Node root;

    public MaximumInBinaryTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        final MaximumInBinaryTree tree = new MaximumInBinaryTree();
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
        int max = maximum(tree.root);
        System.out.println(max);

    }

    public static int maximum(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.getValue(), Math.max(maximum(root.getLeft()), maximum(root.getRight())));
    }
}
