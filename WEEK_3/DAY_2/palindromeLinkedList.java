package WEEK_3.DAY_2;

public class palindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode pre=null;
        while(slow!=null){
            ListNode nextnode=slow.next;
            slow.next=pre;
            pre=slow;
            slow=nextnode;
        }

        ListNode first=head;
        ListNode second=pre;
        while(second!=null){
            if(first.val!=second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }
}
