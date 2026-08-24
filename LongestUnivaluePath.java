//https://www.naukri.com/code360/problems/longest-univalue-path_985291?interviewProblemRedirection=true&difficulty%5B%5D=Medium
/****************************************

Following is the BinaryTreeNode class structure

class BinaryTreeNode {
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;

	BinaryTreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

****************************************/
import java.util.*;
public class Solution {
	public static int longestUnivaluePath(BinaryTreeNode root) {
		// Write your code here
		int res = 0;
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode n = q.poll();
			int ans = find(n.left,n.data)+find(n.right,n.data);
			res = Math.max(res,ans);
			if(n.left!=null)q.offer(n.left);
			if(n.right!=null)q.offer(n.right);
		}
		return res;
	}
	private static int find(BinaryTreeNode root,int val){
		if(root==null||root.data!=val)return 0;
		int left = find(root.left,val);
		int right = find(root.right,val);
		return 1+Math.max(left,right);
	}
}
