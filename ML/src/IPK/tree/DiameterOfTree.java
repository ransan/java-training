package IPK.tree;

public class DiameterOfTree {
    private static int response;
    private Node root;

    public static void main(String[] args) {
        DiameterOfTree tree = new DiameterOfTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(40);
        tree.root.right.left.left = new Node(50);
        tree.root.right.right = new Node(60);
        tree.root.right.right.right = new Node(70);
        System.out.println(diameter(tree.root));
        System.out.println(response);
    }

    private static int diameter(Node node) {
        if (node == null) return 0;
        int leftHeight = diameter(node.left);
        int rightHeight = diameter(node.right);
        response = Math.max(response, 1 + leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
