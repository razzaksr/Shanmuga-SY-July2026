package day4;

import java.util.Arrays;

public class HeaterViaTP {
    public static int find(int[] houses, int[] heaters){
        Arrays.sort(heaters);
        Arrays.sort(houses);
        int radius = 0, trav=0, size = heaters.length;
        for(int house:houses){
            while(trav<size-1&&
                Math.abs(heaters[trav+1]-house)<=
                    Math.abs(heaters[trav]-house)){
                trav++;
            }
            radius = Math.max(radius, Math.abs(heaters[trav]-house));
        }
        return radius;
    }
    public static void main(String[] args) {
        int[] houses = {1,2,3,4,5};
        int[] heaters = {1};
        System.out.println(find(houses, heaters));
    }
}
