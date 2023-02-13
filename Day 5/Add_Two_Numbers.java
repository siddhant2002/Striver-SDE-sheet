package Day 5;

class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0,carry=0;
        ListNode ptr1=l1,ptr2=l2;
        ListNode start=null,prev=null,fresh;
        while(ptr1!=null && ptr2!=null)
        {
            sum=ptr1.val+ptr2.val;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
            sum+=carry;
            if(sum>9)
            {
                carry=1;
                sum-=10;
            }
            else
            {
                carry=0;
            }
            fresh=new ListNode(sum);
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
            sum=ptr1.val;
            ptr1=ptr1.next;
            sum+=carry;
            if(sum>9)
            {
                carry=1;
                sum-=10;
            }
            else
            {
                carry=0;
            }
            fresh=new ListNode(sum);
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
        while(ptr2!=null)
        {
            sum=ptr2.val;
            ptr2=ptr2.next;
            sum+=carry;
            if(sum>9)
            {
                carry=1;
                sum-=10;
            }
            else
            {
                carry=0;
            }
            fresh=new ListNode(sum);
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
        if(carry==1)
        {
            fresh=new ListNode(carry);
            prev.next=fresh;
        }
        return start;
    }
}