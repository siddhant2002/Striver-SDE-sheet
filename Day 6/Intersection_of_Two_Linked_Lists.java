package Day 6;

public class Intersection_of_Two_Linked_Lists
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr=headA,ptr1=headB;
        while(ptr!=ptr1)
        {
            ptr=ptr == null ? headB : ptr.next;
            ptr1=ptr1 == null ? headA : ptr1.next;
        }
        return ptr;
    }
}