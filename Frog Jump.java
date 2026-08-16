import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int h[]) {
        // Write your code here..
        int[][] memo = new int[n][n+1];
        for(int[] i : memo)
            Arrays.fill(i,-1);
        return find(n,h,0,-1,memo);
    }
    private static int find(int n , int[] h ,int i,int prev,int[][] memo){
        if(i == n-1) {
            return prev == -1 ? 0 : Math.abs(h[i] - h[prev]);
        }
        if(memo[i][prev+1]!=-1)return memo[i][prev+1];
        int res = find(n,h,i+1,i,memo);
        if(i+2<n){
            res = Math.min(res,find(n,h,i+2,i,memo));
        }
        if(prev!=-1)res+=Math.abs(h[i]-h[prev]);
        return memo[i][prev+1]=res;
    }
}
