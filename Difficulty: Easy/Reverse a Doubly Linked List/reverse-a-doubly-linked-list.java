/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if (head == null) return head;
        
        Node frwd = null;
        Node p = null;
        Node curr = head;
        
        while(curr!=null){
            frwd = curr.next;
            curr.next = p;
            curr.prev = frwd;
            
            p = curr;
            curr = frwd;
        }
        
        return p;
        
        
        
    }
}