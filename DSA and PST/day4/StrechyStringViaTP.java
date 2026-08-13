package day4;

public class StrechyStringViaTP {
    public static int getLength(String str, int in){
        int cur = in, size = str.length();
        while(cur<size&&str.charAt(in)==str.charAt(cur))
            cur++;
        return cur-in;
    }
    public static boolean isStrechy(String str1,String str2){
        int src=0, dst=0;
        while(src<str1.length()&&dst<str2.length()){
            if(str1.charAt(src)!=str2.charAt(dst)) 
                return false;
            int sLen = getLength(str1, src);
            int dLen = getLength(str2, dst);
            if(sLen<dLen) 
                return false;
            if(sLen!=dLen&&sLen<3) 
                return false;
            src+=sLen;dst+=dLen;
        }
        return src==str1.length()&&dst==str2.length();
    }
    public static int expressiveWords(String str,String[] wds){
        int count = 0;
        for(String each:wds)
            if(isStrechy(str, each)) count++;
        return count;
    }
    public static void main(String[] args) {
        String source= "heeellooo";
        String[] words = {"hello","hi","helo"};
        System.out.println(expressiveWords(source, words));
    }
}
