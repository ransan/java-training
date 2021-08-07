package IPK.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    private Node root;

    public LevelOrderTraversal() {
        this.root = null;
    }

    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(10);
        tree.root.setLeft(new Node(20));
        tree.root.getLeft().setLeft(new Node(40));
        tree.root.getLeft().setRight(new Node(50));
        tree.root.setRight(new Node(30));
        tree.root.getRight().setRight(new Node(70));
        tree.root.getRight().getRight().setRight(new Node(80));
        printLevelOrder(tree.root);
    }


    public static void printLevelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (queue.size() > 1) {
            Node currentNode = queue.poll();
            if (currentNode == null) {
                queue.add(null);
                System.out.println();
                continue;
            }
            System.out.print(currentNode.getValue() + " ");

            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }

        }
    }
}
