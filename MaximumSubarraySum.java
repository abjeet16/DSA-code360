//https://www.naukri.com/code360/problems/maximum-subarray-sum_628288?interviewProblemRedirection=true&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//max = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
			arr[i] = scan.nextInt();
		}
		System.out.println(find(n,arr));
	}
	private static long find(int n, int[] arr){
		long res = Long.MIN_VALUE;
		long curr = 0;
		for(int i = 0 ; i < n ; i++){
			curr+=arr[i];
			res = Math.max(res,curr);
			if(curr<0){
				curr = 0;
			}
		}
		return res;
	}

}
