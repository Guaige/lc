package tree;
/*
https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/solution/mian-shi-ti-33-er-cha-sou-suo-shu-de-hou-xu-bian-6/
面试题33. 二叉搜索树的后序遍历序列（递归分治 / 单调栈，清晰图解）
 */
public class isPostorder {
    public boolean verifyPostorder(int[] postorder) {

        Stack<Integer> s = new Stack<>();
        int root = Integer.MAX_VALUE;
        for (int i=postorder.length-1;i>-1;i--){
            //root>>right>>left
            if (postorder[i]>root)  return false;
            //left都应该比root小 否则false
            while (!s.isEmpty() && s.peek() > postorder[i])
                root = s.pop();
            //第二个数 right 比root大 不满足
            //直到找到left，一直出栈，找到root
            //这里栈的意义：找到比left大中最小的，即root
            //更新root
            s.add(postorder[i]);
            //压第一个数 root，压right
            //left子树判断，此时新root进栈
        }
        return true;
        //return dfs(postorder,0,postorder.length-1);

    }
    public boolean dfs (int[] postorder,int left,int right){
        if (left>=right)    return true;
        //递归出口
        int m = left;
        while (postorder[m] < postorder[right])   m++;
        //m是右子树index，m-1为左子树最后
        int p = m;
        while (postorder[p] > postorder[right])   p++;
        //p是root index
        return (p == right && dfs(postorder,left,m-1) && dfs(postorder,m,right-1));

    }
}
