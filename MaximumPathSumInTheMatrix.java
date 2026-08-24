//https://www.naukri.com/code360/problems/maximum-path-sum-in-the-matrix_797998?leftPanelTabValue=PROBLEM
import java.util.* ;
import java.io.*; 

public class Solution {
	static int[] dir = {0,-1,1};
	public static int getMaxPathSum(int[][] matrix) {
		// Write your code here
		int m = matrix.length;
		int n = matrix[0].length;
		int res = Integer.MIN_VALUE;
		int[][] memo = new int[m][n];
		for(int[] i : memo)Arrays.fill(i,Integer.MIN_VALUE);

		for(int i = 0 ; i < n ; i ++){
			res = Math.max(res,find(0,i,matrix,memo));
		}

		return res;
	}
	private static int find(int i , int j , int[][] matrix,int[][] memo){
		if(i==matrix.length-1)return matrix[i][j];
		if(memo[i][j]!=Integer.MIN_VALUE)return memo[i][j];

		int res = Integer.MIN_VALUE;

		for(int d : dir){
			int nj = j+d;
			if(nj>=0&&nj<matrix[0].length)
				res = Math.max(res,find(i+1,nj,matrix,memo));
		}
		
		return memo[i][j] = matrix[i][j]+res;
	}
}
