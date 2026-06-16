//Math.max(0 , path(root))  to deal with negative sutree sum as it will reduce the sum more
 // and intializing the maxsum = - Infinity bcoz in case of all negative value tree lets if ans is -3 then if maxsum = 0 so on comapring with -3 it will give wrong ans 0.
class Solution {

      int maxsum = Integer.MIN_VALUE;
      
    public int maxPathSum(TreeNode root) {
        path(root);
        return maxsum;
    }

    public int path(TreeNode root){
      

        if(root == null){
            return 0;
        }

        int left = Math.max(0 , path(root.left));
        int right = Math.max(0 , path(root.right));
        
        maxsum = Math.max(maxsum ,( root.val + left + right) );
        
        return root.val + Math.max(left , right);

           }
}
