package IPK.tree;

public class FindHeightOfTheTree {

    private Node root;

    public FindHeightOfTheTree() {
        this.root = null;
    }

    public static void main(String[] args) {

        FindHeightOfTheTree tree = new FindHeightOfTheTree();
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
        int height = getHeight(tree.root);
        System.out.println(height);
    }


    public static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.getLeft()), getHeight(root.getRight())) + 1;
    }
}
