//https://www.naukri.com/code360/problems/reverse-bits_2181102?interviewProblemRedirection=true&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM
public class Solution {
	public static long reverseBits(long n) {
		// Write your code here
		StringBuilder bin = new StringBuilder();
		while(n!=0){
			bin.append(n%2);
			n/=2;
		}
		//System.out.println(bin);
		while(bin.length()<32){
			bin.append('0');
		}
		//System.out.println(bin);
		long pow = 1;
		long ans = 0;
		for(int i = 31 ; i >= 0 ; i--){
			n = bin.charAt(i)-'0';
			ans += n*pow;
			pow*=2;
		}
		return ans;
	}
}
