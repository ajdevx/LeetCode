// Last updated: 15/09/2025, 19:35:19
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>(); // List to store the result
        preorder(root, result); // Helper function to perform the traversal
        return result;
    }

    private void preorder(TreeNode node, List<Integer> result) {
        if (node == null) return; // Base case: if the node is null, return

        result.add(node.val); // Visit the root
        preorder(node.left, result); // Traverse the left subtree
        preorder(node.right, result); // Traverse the right subtree
    }
}