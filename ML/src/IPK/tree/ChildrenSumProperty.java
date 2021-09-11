package IPK.tree;

public class ChildrenSumProperty {
    private Node root;

    public ChildrenSumProperty() {
        this.root = null;
    }

    public static void main(String[] args) {
        final ChildrenSumProperty tree = new ChildrenSumProperty();
        tree.root = new Node(20);
        tree.root.setLeft(new Node(8));
        tree.root.setRight(new Node(12));
        tree.root.getLeft().setLeft(new Node(3));
        tree.root.getLeft().setRight(new Node(5));
        System.out.println(isValidChildernSum(tree.root));
    }

    public static boolean isValidChildernSum(Node root) {
        if (root == null) return true;
        if (root.getLeft() == null && root.getRight() == null) return true;
        int sum = 0;
        if (root.getLeft() != null) {
            sum += root.getLeft().getValue();
        }
        if (root.getRight() != null) {
            sum += root.getRight().getValue();
        }
        return ((root.getValue() == sum) && isValidChildernSum(root.getLeft()) && isValidChildernSum(root.getRight()));
    }
}
