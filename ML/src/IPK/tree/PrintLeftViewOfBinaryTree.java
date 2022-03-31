package IPK.tree;

public class PrintLeftViewOfBinaryTree {
    private Node root;

    public PrintLeftViewOfBinaryTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        final PrintLeftViewOfBinaryTree tree = new PrintLeftViewOfBinaryTree();

        tree.root = new Node(4);
        tree.root.setLeft(new Node(5));
        tree.root.getLeft().setLeft(new Node(10));
        tree.root.setRight(new Node(2));
        tree.root.getRight().setLeft(new Node(3));
        tree.root.getRight().setRight(new Node(1));
        tree.root.getRight().getLeft().setLeft(new Node(6));
        tree.root.getRight().getLeft().setRight(new Node(7));


        Print print = new Print();
        print.printLeftTree(tree.root, 1);

    }
}

class Print {
    private int maxLevel =0;

    public void printLeftTree(Node root, int level) {
        if (root == null) return;
        if (maxLevel < level) {
            System.out.print(root.getValue() + " ");
            maxLevel = level;
        }
        printLeftTree(root.getLeft(), level + 1);
        printLeftTree(root.getRight(), level + 1);
    }
}
