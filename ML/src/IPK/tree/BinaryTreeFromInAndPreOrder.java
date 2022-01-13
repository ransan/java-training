package IPK.tree;

/**
 * Wrong logic
 */
public class BinaryTreeFromInAndPreOrder {
    static int INDEX = 0;

    public static void main(String[] args) {
        int[] inOrder = {40, 20, 60, 50, 70, 10, 80, 100, 30};
        int[] preOrder = {10, 20, 40, 50, 60, 70, 30, 80, 100};
        Node res = arrayToBinaryTree(inOrder, preOrder, 0, preOrder.length - 1);
        PreOrderTraversal.doPreOrderTraversal(res);
    }

    private static Node arrayToBinaryTree(int[] inOrder, int[] preOrder, int start, int end) {
        if (start > end) {
            return null;
        }
        Node node = new Node(preOrder[INDEX++]);
        INDEX = start;
        for (int i = 0; i < inOrder.length; i++) {
            if (inOrder[i] == node.value) {
                INDEX = i;
                break;
            }
        }
        node.left = arrayToBinaryTree(inOrder, preOrder, start, INDEX - 1);
        node.right = arrayToBinaryTree(inOrder, preOrder, INDEX, end - 1);
        return node;
    }
}
