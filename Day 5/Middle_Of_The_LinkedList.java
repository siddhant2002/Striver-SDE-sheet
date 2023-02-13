package Day 5;

class Middle_Of_The_LinkedList
{
    public ListNode middleNode(ListNode head) {
        if(head==null)
        {
            return head;
        }
        int c=count(head);
        int k=1;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next,k++)
        {
            if(k==c/2+1)
            {
                return ptr;
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