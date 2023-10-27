package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class IterativeInorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    List<Integer> inorderTree = new ArrayList<>();

    public List<Integer> inorderIterativeTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            TreeNode top = stack.pop();
            inorderTree.add(top.val);
            current = top.right;
        }


        return inorderTree;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        IterativeInorderTraversal tree = new IterativeInorderTraversal();
        System.out.println("Iterative Inorder Traversal: " +  tree.inorderIterativeTraversal(root));
    }
}
