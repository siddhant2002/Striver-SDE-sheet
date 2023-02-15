package Day 7;

class Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        int c=count(head);
        if(k==0 || head==null || head.next==null)
        {
            return head;
        }
        k=k%c;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            if(ptr.next==null)
            {
                ptr.next=head;
                break;
            }
        }
        int p=c-k;
        c=1;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next,c++)
        {
            if(c==p)
            {
                head=ptr.next;
                ptr.next=null;
            }
        }
        return head;
    }
    public int count(ListNode head)
    {
        int c=0;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next,c++);
        return c++;
    }
}