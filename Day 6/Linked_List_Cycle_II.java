package Day 6;

public class Linked_List_Cycle_II
{
    public ListNode detectCycle(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                fast=head;
                while(fast!=slow)
                {
                    fast=fast.next;
                    slow=slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}