/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node headRef) {
        // code here
        if (headRef == null) {
                return null;
            }
        Node i = headRef;
        Node j = headRef;

        while(j!=null){
            if(i.data!= j.data){
                i.next = j;
                j.prev = i;
                i = j;
            }

            j = j.next;
        }

        i.next = null;

        return headRef;

    }
}