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
    
    int sum =0;
    
    public void update(TreeNode root){
       
        if(root==null){
            return;
        }
        update(root.right);
        sum+=root.val;
        root.val=sum;
        update(root.left);
    }
    
    public TreeNode bstToGst(TreeNode root) {
        
        update(root);
        
        return root;
        
    }
}
