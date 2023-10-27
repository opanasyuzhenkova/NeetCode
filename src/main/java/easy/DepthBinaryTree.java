package easy;

public class DepthBinaryTree {

    static class Node {
        int value;
        Node left, right;

        public Node(int val) {
            value = val;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        int maxDepth(Node root) {
            if (root == null)
                return 0;
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            if (leftDepth > rightDepth)
                return leftDepth + 1;
            else
                return rightDepth + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(7);
        System.out.println("Max depth of BT: " + tree.maxDepth(tree.root));


    }
}
