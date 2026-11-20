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
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }
    private TreeNode buildTree(int[] arr, int left, int ri){
        if(left > ri){
            return null;
        }
        int mid = left + (ri - left)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = buildTree(arr, left, mid - 1);
        root.right = buildTree(arr, mid + 1, ri);
        return root;
    }
}