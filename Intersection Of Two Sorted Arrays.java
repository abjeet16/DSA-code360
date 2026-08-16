import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		if(n>m)return findArrayIntersection(arr2,m,arr1,n);

		int i = 0;
		int left = 0;
		int right = m-1;
		ArrayList<Integer> res = new ArrayList<Integer>();
		while(i < n){
			int curr = arr1.get(i);
			int idx = find(left,right,arr2,curr);
			if(idx!=-1){
				left=idx+1;
				res.add(curr);
			}
			//while(i<n&&arr1.get(i)==curr)
			i++;
		}
		return res;
	}
	private static int find(int left,int right,ArrayList<Integer> arr,int t){
		int res = -1;
		while(left<=right){
			int mid = (left+right)/2;
			int val = arr.get(mid);
			if(val>=t){
				if(val==t)res = mid;
				right = mid-1;
			}else{
				left = mid+1;
			}
		}
		return res;
	}
}
