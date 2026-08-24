//https://www.naukri.com/code360/problems/longest-common-subsequence_624879?interviewProblemRedirection=true&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM
import java.util.*;
public class Solution {

	public static int lcs(String s, String t) {
		//Your code goes here
		int[][] memo = new int[s.length()][t.length()];
		for(int[] i : memo)Arrays.fill(i,-1);

		return find(s,t,0,0,memo);
    }
	private static int find(String a,String b,int i,int j,int[][] memo){
		if(i==a.length()||j==b.length())return 0;
		if(memo[i][j]!=-1)return memo[i][j];

		char ci = a.charAt(i);
		char cj = b.charAt(j);

		if(ci==cj){
			return 1 + find(a,b,i+1,j+1,memo);
		}
		return memo[i][j] = Math.max(find(a,b,i+1,j,memo),find(a,b,i,j+1,memo));
	}

}
