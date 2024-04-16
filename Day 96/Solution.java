
class Solution {

    public TreeNode helper(TreeNode root,int val,int depth,int currdepth){
        if(depth==1){
            TreeNode zoo=new TreeNode(val);
            zoo.left=root;
            return zoo;
        }

        if(root==null){
            return root;
        }

        if(currdepth==depth-1){
            TreeNode leftman=root.left;
            TreeNode rightman=root.right;

            root.left=new TreeNode(val);
            root.right=new TreeNode(val);

            root.left.left=leftman;
            root.right.right=rightman;
            return root;
            
        }

        helper(root.left,val,depth,currdepth+1);
        helper(root.right,val,depth,currdepth+1);

        return root;

    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
     return  helper(root,val,depth,1);

        
    }
}
