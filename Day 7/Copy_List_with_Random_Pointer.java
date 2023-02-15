package Day 7;

class Copy_List_with_Random_Pointer
{
    public Node copyRandomList(Node head) {
        Node start=head;
        while(start!=null)
        {
            Node ptr=start.next;
            Node fresh=new Node(start.val);
            start.next=fresh;
            fresh.next=ptr;
            start=ptr;
        }
        start=head;
        while(start!=null)
        {
            if(start.random!=null)
            {
                start.next.random=start.random.next;
            }
            start=start.next.next;
        }
        start=head;
        Node ptr=null,prev=null;
        while(start!=null)
        {
            Node k=start.next;
            Node ptr1=start.next.next;
            if(ptr==null)
            {
                ptr=start.next;
            }
            else
            {
                prev.next=start.next;
            }
            prev=start.next;
            start.next=ptr1;
            start=start.next;
        }
        return ptr;
    }
}