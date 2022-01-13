package IPK.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversalInSpiral {
    private Node root;

    public static void main(String[] args) {
        TreeTraversalInSpiral tree = new TreeTraversalInSpiral();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(30);
        tree.root.right.right = new Node(35);
        spiralTraversal(tree.root);
    }

    private static void spiralTraversal(Node root) {
        if (root == null) return;
        Stack<Integer> stack = new Stack<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                Node next = queue.poll();
                if (reverse) {
                    stack.push(next.value);
                } else {
                    System.out.print(next.value + " ");
                }
                if (next.left != null) {
                    queue.add(next.left);
                }
                if (next.right != null) {
                    queue.add(next.right);
                }
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            reverse = !reverse;
            System.out.println();
        }
    }
}
