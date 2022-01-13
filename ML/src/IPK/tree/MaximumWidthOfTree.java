package IPK.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, write a function to get the maximum width of the given tree.
 * Width of a tree is maximum of widths of all levels.
 *
 * Let us consider the below example tree.
 *
 *
 *
 *          1
 *         /  \
 *        2    3
 *      /  \     \
 *     4    5     8
 *               /  \
 *              6    7
 * For the above tree,
 * width of level 1 is 1,
 * width of level 2 is 2,
 * width of level 3 is 3
 * width of level 4 is 2.
 * So the maximum width of the tree is 3.
 */
public class MaximumWidthOfTree {
    private Node root;

    public MaximumWidthOfTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        MaximumWidthOfTree tree = new MaximumWidthOfTree();
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
        System.out.println(getWidth(tree.root));
    }

    public static int getWidth(Node root) {
        if (root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int res = 0;
        while (!queue.isEmpty()) {
            int count = queue.size();
            res = Math.max(res, count);
            Node current = queue.poll();
            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
        }
        return res;
    }
}
