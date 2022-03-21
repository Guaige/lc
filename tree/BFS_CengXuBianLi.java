package tree;
/*
102. 二叉树的层序遍历
https://leetcode-cn.com/problemset/all/?search=%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86&page=1
 */
public class BFS_CengXuBianLi {
    public int[] levelOrder(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            while (size>0){
                TreeNode t = q.poll();
                if (t == null){size--;continue;}
                //本身就是边缘 BFS多注意
                l.add(t.val);
                if (t.left!=null)   q.offer(t.left);
                if (t.right!=null)  q.offer(t.right);
                size--;
            }
        }
        int[] n = new int[l.size()];
        for (int i=0;i<l.size();i++){
            n[i] = l.get(i);
        }
        return n;
    }
}

