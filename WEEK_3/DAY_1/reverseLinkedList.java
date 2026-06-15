package WEEK_3.DAY_1;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val; 
    }
    ListNode(int val, ListNode next) {
        this.val = val; 
        this.next = next; 
    }
}

public class reverseLinkedList {
    public ListNode reverseList(ListNode head){
        ListNode slow=head;
        ListNode prev=null;
        while(slow!=null){
            ListNode nextnode=slow.next;
            slow.next=prev;
            prev=slow;
            slow=nextnode;
        }
        return prev;
    } 
}