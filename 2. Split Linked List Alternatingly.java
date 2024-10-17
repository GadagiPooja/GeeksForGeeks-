
// User function Template for Java
/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

};
*/

class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
        Node arr[]=new Node[2];
        if(head==null) return arr;
        if(head.next==null){
            arr[0]=head;
            return arr;
        }
        Node odd=head;
        Node even=head.next;
        Node oddHead=odd;
        Node evenHead=even;
        while(even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
            
        }
        odd.next=null;
        arr[0]=oddHead;
        arr[1]=evenHead;
        return arr;
    }
}
