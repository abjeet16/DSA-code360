/*******************************************************
Following is the Interval class structure

    class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
*******************************************************/

import java.util.*;

public class Solution {

public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals) {
        // Write your code here.
        
        Collections.sort(
            intervals,
            (a,b)->a.start!=b.start?Integer.compare(a.start,b.start):Integer.compare(a.end,b.end));
        Interval int1 = intervals.get(0);
        int start = int1.start;
        int end = int1.end;
        ArrayList<Interval> res = new ArrayList<>();
        for(int i = 1 ; i < intervals.size() ; i++){
            Interval curr = intervals.get(i);
            int currs = curr.start;
            int curre = curr.end;
            if(currs>end){
                res.add(new Interval(start,end));
                start = currs;
                end = curre;
            }else if(end < curre){
                end = curre;
            }
        }
        res.add(new Interval(start,end));
        return res;
    }
}
