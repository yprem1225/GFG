class Solution {
    static int sumOfDigits(int n) {
        // code here
        int sum = 0;
        
        while(n!=0){
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        
        return sum;
    }
}
