import java.util.*;
public class Solution {
    public static long getTrappedWater(long []arr, int n) {
        // Write your code here.
        long[] pre = new long[n];
        pre[0]=arr[0];
        for(int i = 1; i < n ; i++){
            pre[i] = Math.max(pre[i-1],arr[i]);
        }
        //System.out.println(Arrays.toString(pre));
        long res = 0;
        long post = 0;
        for(int i = n-1; i >= 0 ; i--){
            long toadd = Math.min(pre[i],post)-arr[i];
            if(toadd>0)res+=toadd;
            post = Math.max(post,arr[i]);
        }
        return res;
    }
}
