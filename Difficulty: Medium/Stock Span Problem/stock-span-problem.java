class Solution {
    public class Pair{
        int val;
        int idx;
        Pair(int val , int idx){
            this.val = val;
            this.idx = idx;
        }
    }
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        int n = arr.length;
        int [] span = new int[n];
        span[0] = 1;
        
        Stack<Pair> st = new Stack<>();
        
        Pair p = new Pair(arr[0] , 0);
        st.push(p);
        
        for(int i = 1 ; i<n ; i++){
            while(st.size()>0 && st.peek().val <= arr[i]){
                st.pop();
            }
            
            if(st.size() == 0){
                span[i] = i+1;
                st.push(new Pair(arr[i],i));
            }else{
                span[i] = i - st.peek().idx;
                st.push(new Pair(arr[i],i));
            }
        }
        
         ArrayList<Integer> ans = new  ArrayList<Integer>();
         for(int i = 0 ; i<n ; i++){
             ans.add(span[i]);
         }
         
         return ans;
        
    }
}