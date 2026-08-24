//https://www.naukri.com/code360/problems/minimum-elements_3843091?interviewProblemRedirection=true&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minimumElements(int num[], int x) {
        // Write your code here..
        int[][] memo = new int[num.length][x+1];
        for(int[] i : memo)Arrays.fill(i,-1);

        int res = find(num,x,0,memo);
        return res>x+1?-1:res;
    }
    private static int find(int[] nums,int target,int i,int[][] memo){
        if(i==nums.length||target<0)return Integer.MAX_VALUE;
        if(target==0)return 0;
        if(memo[i][target]!=-1)return memo[i][target];

        int res = Integer.MAX_VALUE;
        for(int j = i ; j < nums.length ; j++){
            int ans = find(nums,target-nums[j],j,memo);
            if(ans!=Integer.MAX_VALUE)res = Math.min(res,1+ans);
        }
        return memo[i][target]=res;
    }

}
