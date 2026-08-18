package day7;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingReplacementViaVarySW {
    public static int characterReplacement(String txt, int k) {
        int max = 0, maxfreq = 0, start = 0;
        Map<Character,Integer> heap = new HashMap<>();
        for(int end=0;end<txt.length();end++){
            char key = txt.charAt(end);
            heap.put(key, heap.getOrDefault(key, 0)+1);
            maxfreq = Math.max(heap.get(key),maxfreq);
            while((end-start+1)-maxfreq>k){
                char sKey = txt.charAt(start);
                heap.put(sKey, heap.get(sKey)-1);
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
