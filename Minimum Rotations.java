import java.util.* ;
import java.io.*; 
public class Solution {

	public static int minimumRotations(int n, String s) {
		// Write your code here.
		String rot = s+s;
		for(int i = 1 ; i < 2*n ; i++){
			if(rot.substring(i,i+n).equals(s))return i;
		}
		return -1;
	}

}
