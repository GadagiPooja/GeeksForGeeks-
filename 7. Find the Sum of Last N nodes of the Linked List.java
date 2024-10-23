
class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int k) {
        // write code here
         int size = 0;
          
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
          
        temp = head;
        int count = size - k;
        while (temp != null && count > 0) {
            temp = temp.next;
            count--;
        }
            
        int sum = 0;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }
}
