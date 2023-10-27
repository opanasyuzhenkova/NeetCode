package easy;


import java.util.ArrayList;
import java.util.List;

public class RecursiveInorderTraversalBinTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(Integer o) {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    List<Integer> inorderTree = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        if (root != null) {

            inorderTraversal(root.left);
            inorderTree.add(root.val);
            inorderTraversal(root.right);

        }
        return inorderTree;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        RecursiveInorderTraversalBinTree tree = new RecursiveInorderTraversalBinTree();
        System.out.println("Inorder Traversal: " + tree.inorderTraversal(root));
    }
}
