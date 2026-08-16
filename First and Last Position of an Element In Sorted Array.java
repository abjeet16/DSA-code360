import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int left = 0;
        int right = n-1;
        int[] res = new int[]{-1,-1};
        while(left<=right){
            int mid = (left+right)/2;

            if(arr.get(mid)==k){
                res[0] = mid;
                right = mid-1;
            }else if(arr.get(mid)>k){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        left = 0;
        right = n-1;
        while(left<=right){
            int mid = (left+right)/2;

            if(arr.get(mid)==k){
                res[1] = mid;
                left = mid+1;
            }else if(arr.get(mid)>k){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return res;
    }
};
