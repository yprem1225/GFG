class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        
        if (k > q.size()) {
            return q;
        }
        
        Stack<Integer> st = new Stack<>();
        // Put first k elements into stack
        for(int i = 0 ; i<k ; i++){
            st.push(q.peek());
            q.remove();
        }
        
        // Add reversed elements back
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        
         int remaining = q.size() - k;
        for(int i = 0 ; i<remaining ; i++){
            q.add(q.remove());
        }
        
        return q;
    }
}