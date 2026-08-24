//https://www.naukri.com/code360/problems/minimum-cost-to-make-string-valid_1115770?interviewProblemRedirection=true&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findMinimumCost(String str) {
		// Write your code here
      if(str.length()%2!=0)return -1;
      int curr = 0;
      int res = 0;
      for(char ch : str.toCharArray()){
        if(ch=='{'){
          curr++;
        }else{
          if(curr==0){
            res++;
            curr++;
          }else{
            curr--;
          }
        }
      }
      return res+curr/2;
    }
}
