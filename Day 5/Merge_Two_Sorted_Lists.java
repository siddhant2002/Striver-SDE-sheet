package Day 5;

class Merge_Two_Sorted_Lists{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptr1=list1,ptr2=list2;
        ListNode start=null,prev=null;
        while(ptr1!=null && ptr2!=null)
        {
            ListNode fresh;
            if(ptr1.val > ptr2.val)
            {
                fresh=new ListNode(ptr2.val);
                ptr2=ptr2.next;
            }
            else
            {
                fresh=new ListNode(ptr1.val);
                ptr1=ptr1.next;
            }
            if(start==null)
            {
                start=fresh;
            }
            else
            {
                prev.next=fresh;
            }
            prev=fresh;
        }
        while(ptr1!=null)
        {
            ListNode fresh=new ListNode(ptr1.val);
            if(start==null)
            {
                start=fresh;
            }
            else
            {
                prev.next=fresh;
            }
            prev=fresh;
            ptr1=ptr1.next;
        }
        while(ptr2!=null)
        {
            ListNode fresh=new ListNode(ptr2.val);
            if(start==null)
            {
                start=fresh;
            }
            else
            {
                prev.next=fresh;
            }
            prev=fresh;
            ptr2=ptr2.next;
        }
        return start;
    }
}