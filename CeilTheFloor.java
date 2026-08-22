import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Write your code here.
      int floor = Integer.MIN_VALUE;
      int cell = Integer.MAX_VALUE;

      int[] res = new int[]{-1,-1};
      for(int i : a){
        if(i<=x){
          floor = Math.max(floor,i);
          res[0]=floor;
        }
        if(i>=x){
          cell = Math.min(cell,i);
          res[1] = cell;
        }
      }
      return res;
    }
    
}
