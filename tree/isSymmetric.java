package tree;
/*
https://leetcode-cn.com/problemset/all/?search=%E9%95%9C%E5%83%8F
 */
public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return mir(root.left,root.right);
    }
    public static boolean mir(TreeNode l,TreeNode r){
        if (l==null && r==null) return true;
        if (l==null || r==null || l.val!=r.val) return false;
        return mir(l.left,r.right) && mir(l.right,r.left);
    }
}
