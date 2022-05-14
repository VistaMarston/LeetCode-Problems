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
        TreeNode root = new TreeNode(nums[nums.length/2]);
        TreeNode temp = root;
        addItemsToTree(nums, temp, 0, nums.length);
        return root;
    }
    
    /**
    * addItemsToTree - This is the recursive function that will break the 
    * array into subarrays and add these items into the list
    */
    private void addItemsToTree(int[] nums, TreeNode temp, int start, int end) {
        if(start < end) {
            TreeNode node = new TreeNode(nums[(start+end)/2]);
            insertItemIntoTree(temp, node);
            addItemsToTree(nums, temp, (start+end)/2 + 1, end);
            addItemsToTree(nums, temp, start, (start+end)/2);
        }
    }
    
    /**
    * insertItemIntoTree - This is a helper function that will add
    * the specific item into the tree in the current location that is
    * should be to maintain height-balance. 
    */
    private void insertItemIntoTree(TreeNode tree, TreeNode node) {
        TreeNode temp = tree;
        
        while(temp != null) {
            if(temp.val < node.val) {
                if(temp.right == null) {
                    temp.right = node;
                    return;
                }
                temp = temp.right;  
            } else if (temp.val > node.val) {
                if(temp.left == null) {
                    temp.left = node;
                    return;
                }
                temp = temp.left;
            }  
            else
                return;
        }
    }
}
