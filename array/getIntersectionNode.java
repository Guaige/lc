package array;
/*
剑指 Offer 52. 两个链表的第一个公共节点
https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 */
public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA==null || headB==null) return null;    //或
        ListNode a = headA,b = headB;
        /*  同时指向为出口
            相交：m == n    同时指向交点
                            a指向headB，继续遍历b；b又遍历a，m+n+c后同时指向交点
            不相交          同时指向null
                            m+n次后同时指向null
                            */
        while (a!=b){
            if (a!=null)    a = a.next;
            else    a = headB;
            if (b!=null)    b = b.next;
            else    b = headA;
        }
        return a;
        /*
        HashSet<ListNode> s = new HashSet<>();
        ListNode a = headA,b = headB;
        while(a!=null){
            s.add(a);
            a = a.next;
        }
        while (b!=null){
            if (s.contains(b))  return b;
            b = b.next;
        }
        return null;
        */
    }
}
