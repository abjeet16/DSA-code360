public class Solution {
    public static int makeBeautiful(String str) {
        int s1 = 0;
        int s0 = 0;
        char[] chars = str.toCharArray();
        if(chars[0]=='1')s0++;
        else s1++;
        //System.out.println(s0+" "+s1);
        chars[0]='0';
        s0+=find(chars);
        //System.out.println(s0+" "+s1);
        chars = str.toCharArray();
        chars[0]='1';
        s1+=find(chars);
        //System.out.println(s0+" "+s1);
        return Math.min(s0,s1);
    }
    private static int find(char[] chars){
        int res = 0;
        for(int i = 1 ; i < chars.length ; i++){
            if(chars[i-1]==chars[i]){
                //System.out.println(i);
                res++;
                chars[i]=chars[i]=='1'?'0':'1';
            }
        }
        return res;
    }
}
