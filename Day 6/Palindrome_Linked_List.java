package Day 6;

class Palindrome_Linked_List
{
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        StringBuilder nm=new StringBuilder();
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            nm.append(ptr.val);
        }
        return nm.toString().equals(nm.reverse().toString());
    }
}