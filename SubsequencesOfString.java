//https://www.naukri.com/code360/problems/subsequences-of-string_985087?interviewProblemRedirection=true&difficulty%5B%5D=Medium&leftPanelTabValue=PROBLEM
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

class Solution {
    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        ArrayList<String> res = new ArrayList<>();
        find(res,0,new StringBuilder(),str);
        return res;
    }
    private static void find(ArrayList<String> res,int i,StringBuilder curr,String str){
        if(i==str.length()){
            if(curr.length()>0)res.add(curr.toString());
            return;
        }
        find(res,i+1,curr,str);
        curr.append(str.charAt(i));
        find(res,i+1,curr,str);
        curr.deleteCharAt(curr.length()-1);
    }
}
