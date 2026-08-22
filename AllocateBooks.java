//https://www.naukri.com/code360/problems/ayush-gives-ninjatest_1097574?interviewProblemRedirection=true&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM
import java.util.* ;
import java.io.*; 
public class Solution {
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        long low = 0;
        long high = time[0];
        for(int i : time){
            low = Math.min(low,i);
            high+=i;
        }
        long res = Long.MAX_VALUE;
        while(low<=high){
            long mid = (low+high)/2;
            if(check(mid,n,time)){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
    private static boolean check(long max,int days,int[] time){
        long curr = 0;
        for(int i : time){
            if(days==0||i>max)return false;
            if(curr+i<=max){
                curr+=i;
            }else{
                days--;
                curr = i;
            }
        }
        return days>0;
    }
}
