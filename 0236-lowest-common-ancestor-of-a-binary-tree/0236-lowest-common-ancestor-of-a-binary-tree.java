class Solution {
    public static TreeNode out;
    public static boolean findit(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root == null)
            return false;
        
        boolean a = findit(root.left,p,q);
        boolean b = findit(root.right,p,q);
        
        
        if(root.val == p.val || root.val == q.val)   
        {
            if(a||b)
                out = root;
            return true;
        }
        if(a&&b)  
        {
            out = root;
        }
        return a||b;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findit(root,p,q);
        return out;
    }
}