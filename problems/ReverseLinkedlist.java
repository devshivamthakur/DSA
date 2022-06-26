package problems;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
public class ReverseLinkedlist {
    public static ListNode reverseList(ListNode head){
        ListNode current=head;
        ListNode Previous=null;

        while(current!=null){
            ListNode temp=current.next;
            current.next=Previous;
            Previous=current;
            current=temp;
        }
        return Previous;

    } 
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode res = reverseList(l1);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        
    }
    
}
