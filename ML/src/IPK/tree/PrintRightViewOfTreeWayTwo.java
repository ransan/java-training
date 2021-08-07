package IPK.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintRightViewOfTreeWayTwo {
    private static int maxLevel = 0;
    private Node root;

    public PrintRightViewOfTreeWayTwo() {
        this.root = null;
    }

    public static void main(String[] args) {
        final PrintRightViewOfTreeWayTwo tree = new PrintRightViewOfTreeWayTwo();
        tree.root = new Node(4);
        tree.root.setLeft(new Node(5));
        tree.root.setRight(new Node(2));
        tree.root.getRight().setLeft(new Node(3));
        tree.root.getRight().setRight(new Node(1));
        tree.root.getRight().getLeft().setLeft(new Node(6));
        tree.root.getRight().getLeft().setRight(new Node(7));
        rightViewOfBinaryTree(tree.root, 1);
    }

    public static void rightViewOfBinaryTree(Node root, int level) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                Node currentNode = queue.poll();
                if (i == size) {
                    System.out.println(currentNode.getValue());
                }
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }
        }
    }
}
