package Day 5;

class Delete_Node_In_A_Linked_List
{
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}