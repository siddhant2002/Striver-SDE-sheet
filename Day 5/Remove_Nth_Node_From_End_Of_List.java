package Day 5;

class Remove_Nth_Node_From_End_Of_List
{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null && n==1)
        {
            return null;
        }
        int c=count(head);
        int k=1;
        if(n==c)
        {
            return head.next;
        }
        if(n==1)
        {
            ListNode ptr;
            for(ptr=head;ptr.next.next!=null;ptr=ptr.next);
            ptr.next=null;
            return head;
        }
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next,k++)
        {
            if(k==c-n)
            {
                ptr.next=ptr.next.next;
            }
        }
        return head;
    }
    public int count(ListNode head)
    {
        int c=0;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next,c++);
        return c;
    }
}