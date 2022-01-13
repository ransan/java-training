package IPK.tree;

/**
 * ROOT LEFT RIGHT
 */
public class PreOrderTraversal {

    private Node root;

    public PreOrderTraversal() {
        this.root = null;
    }

    public static void main(String[] args) {

        /**
        PreOrderTraversal tree = new PreOrderTraversal();
         tree.root = new Node(10);
         tree.root.setLeft(new Node(9));
         tree.root.setRight(new Node(20));
         tree.root.getLeft().setLeft(new Node(5));
         **/

        PreOrderTraversal tree = new PreOrderTraversal();
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
        doPreOrderTraversal(tree.root);
    }

    public static void doPreOrderTraversal(Node root) {
        if (root != null) {
            System.out.println(root.getValue());
            doPreOrderTraversal(root.getLeft());
            doPreOrderTraversal(root.getRight());
        }
    }
}
