package day6;

import java.util.Arrays;

public class ReverseViaRecursion {
    public static void reverse(String[] orgs, 
        int start, int end)
    {
        if(start<end){
            String third = orgs[start];
            orgs[start] = orgs[end];
            orgs[end] = third;
            reverse(orgs, start+1, end-1);
        }else return;
    }
    public static void main(String[] args) {
        String[] campus = {"tcs","zoho","infy",
        "ibm","lti"};
        reverse(campus, 0, campus.length-1);
        System.out.println(Arrays.toString(campus));
    }
}
