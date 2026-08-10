package day1;

import java.util.Arrays;

public class CountingBits {
    public static int[] count(int number){
        int[] result = new int[number+1];
        for(int select = 0;select<=number;select++)
            result[select] = bits(select);
        return result;
    }
    public static int bits(int selected){
        int counter=0;
        while(selected>0){
            selected &=(selected-1);
            counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(count(5)));
    }
}
