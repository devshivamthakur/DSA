class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class MiddleofLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        // l1.next = new ListNode(2);
        // l1.next.next = new ListNode(4);
        ListNode res = findmiddle(l1);
        System.out.println(res.val);
        
    }
    public static ListNode findmiddle(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
    
        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
            }
            slow=slow.next;

        }
        return slow;
    }
}
