public class Solution {
    public static int setBits(int N){
        // Write your code here.
        int add = 1;
        int copy = N;
        while(copy%2!=0){
            add*=2;
            copy/=2;
        }
        return copy==0?N:N+add;
    }
}
