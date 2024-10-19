
// User function Template for Java
class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        // Code here
           List<Integer> nn = new LinkedList<Integer>();
        DLLNode temp=head;
        while(temp!=null){
            nn.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(nn);
        temp=head;
        for(int b:nn){
            temp.data=b;
            temp=temp.next;
        }
        return head;
    }
}
