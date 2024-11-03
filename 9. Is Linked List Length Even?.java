class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        if(head==null)
        return true;
        if(head.next==null)
        return false;
        while(head!=null)
        {
            if(head.next==null)
            return false;
            head=head.next.next;
        }
        return true;
    }
}
