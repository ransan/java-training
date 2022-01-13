package IPK.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftViewWayTwo {
    private Node root;

    public PrintLeftViewWayTwo() {
        this.root = null;
    }

    public static void main(String[] args) {
        final PrintLeftViewWayTwo tree = new PrintLeftViewWayTwo();
        /**
         tree.root = new Node(4);
         tree.root.setLeft(new Node(5));
         tree.root.setRight(new Node(2));
         tree.root.getRight().setLeft(new Node(3));
         tree.root.getRight().setRight(new Node(1));
         tree.root.getRight().getLeft().setLeft(new Node(6));
         tree.root.getRight().getLeft().setRight(new Node(7));
         */
        tree.root = new Node(10);
        tree.root.setLeft(new Node(5));
        tree.root.setRight(new Node(15));
        tree.root.getRight().setLeft(new Node(20));
        printLeftView(tree.root);
    }

    public static void printLeftView(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                Node currentNode = queue.poll();
                if (i == 1) {
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
