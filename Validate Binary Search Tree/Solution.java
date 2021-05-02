// Runtime - 1ms
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
    
    ArrayList<Integer> nodes = new ArrayList<Integer>();
    
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        nodes.add(root.val);
        inorder(root.right);
    }
    
    public boolean isValidBST(TreeNode root) {
        
        inorder(root);
        for(int i =0;i<nodes.size()-1;i++){
            if(nodes.get(i)<nodes.get(i+1)){
                
            }else{
                return false;
            }
        }
        return true;
    }
}
