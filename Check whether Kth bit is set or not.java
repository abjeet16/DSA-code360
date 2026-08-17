public class Solution {
    static boolean isKthBitSet(int n, int k) {
        // Write your code here.
        while(n!=0){
            int rem = n%2;
            n/=2;
            k--;
            if(k==0)return rem==1;
        }
        return false;
    }
}
