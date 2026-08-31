class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        // ArrayList<Integer> ans = new ArrayList<Integer>();

        // for(int i = 0 ; i<arr.length-1; i++){
        //     int  nextGreater = -1;
        //     for(int j = i+1 ; j<arr.length; j++){
        //         if(arr[j]>arr[i]){
        //             nextGreater = arr[j];
        //             break;
        //         }
        //     }
        //     ans.add(nextGreater);
        // }
        
        // ans.add(-1);
        
        // return ans;
        
        
        //using stack
        int [] nge = new int[arr.length];
        nge[arr.length-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        
        
        for(int i = arr.length-2 ; i>=0 ; i--){
            while(st.size() >0 &&arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size() ==  0){
                nge[i] = -1;
                st.push(arr[i]);
            }else{
                nge[i] = st.peek();
                st.push(arr[i]);
            }
            
        }
        
         ArrayList<Integer> ans = new ArrayList<>();
         for(int ele :nge){
             ans.add(ele);
         }
        
        return ans;
    }
}