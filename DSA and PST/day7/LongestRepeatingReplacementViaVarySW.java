package day7;

public class LongestRepeatingReplacementViaVarySW {
    public static int characterReplacement(String txt, int k) {
        int max = 0, maxfreq = 0, start = 0;
        int[] arr = new int[26];
        for(int end=0;end<txt.length();end++){
            int index = txt.charAt(end)-'A';
            arr[index]++;
            maxfreq = Math.max(arr[index],maxfreq);
            while((end-start+1)-maxfreq>k){
                arr[txt.charAt(start)-'A']--;
                start++;
            }
            max = Math.max(max,end-start+1);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));
        System.out.println(characterReplacement("ABBB", 2));
    }
}
