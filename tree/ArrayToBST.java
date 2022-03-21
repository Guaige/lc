package tree;
/*
https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 */

/*
108. 将有序数组转换为二叉搜索树
给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
*/

class ArrayToBST {
    public TreeNode sortedArrayToBST(int[] n) {
        return ArrayToBST(n,0,n.length-1);
    }
    public static TreeNode ArrayToBST(int[] n,int l,int r){
        if (l>r)    return null;
        int m = (l+r) / 2;
        TreeNode treeNode = new TreeNode(n[m]);
        //m-1 m+1 m是根节点，和排序不一样，树被分成3部分，而不是两部分
        treeNode.left = ArrayToBST(n,l,m-1);
        treeNode.right = ArrayToBST(n,m+1,r);
        return treeNode;
    }
}