package array;

public class LinkNode {
    int val;
    LinkNode next;
    public LinkNode(int val){
        this.val = val;
    }
    public LinkNode(){

    }

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        LinkNode head = ArrayToNode(n);
        System.out.println("构造链表");
        PrintNode(head);
        LinkNode cur = ReverseNode(head);
        System.out.println("反转链表");
        PrintNode(cur);
    }

    public static LinkNode ArrayToNode(int[] n){
        LinkNode cur = new LinkNode();
        LinkNode pre = cur;
        for (int i = 0; i < n.length; i++) {
            LinkNode node = new LinkNode(n[i]);
            cur.next = node;
            cur = node;
        }
        return pre.next;
    }

    public static LinkNode ReverseNode(LinkNode head){
        LinkNode cur = head;
        LinkNode pre = null;
        while(cur!=null){
            LinkNode t = cur.next;
            cur.next = pre;
            pre = cur;
            cur = t;
        }
        return pre;
    }

    public static void PrintNode(LinkNode head){
        while(head!=null){
            System.out.print(' ' + String.valueOf(head.val));
            head = head.next;
        }
        System.out.println();
    }
}
