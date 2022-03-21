package tree;
/*
https://leetcode-cn.com/problemset/all/?search=%E7%BF%BB%E8%BD%AC
 */
//翻转二叉树 先交换再递归 先递归再根节点交换
class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {

        if (root==null) return null;


        TreeNode r = mirrorTree(root.right);
        TreeNode l = mirrorTree(root.left);
        root.left = r;
        root.right = l;

        /*
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        mirrorTree(root.right);
        mirrorTree(root.left);
        */
        return root;
    }

}
