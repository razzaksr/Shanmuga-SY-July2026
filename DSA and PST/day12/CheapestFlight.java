package day12;

import java.util.Arrays;

public class CheapestFlight {
    public static int cheap(int size, int[][] flights, 
            int src, int dst, int stops){
        int[] dist=new int[size];
        Arrays.fill(dist,Integer.MAX_VALUE);dist[src]=0;
        for(int it=0;it<=stops;it++){
            int[] tmp = Arrays.copyOf(dist, size);
            for(int[] flight:flights){
                int cs = flight[0], cd=flight[1], cost=flight[2];
                if(dist[cs]!=Integer.MAX_VALUE&&
                                dist[cs]+cost<tmp[cd]){
                    tmp[cd]=dist[cs]+cost;
                }
            }
            dist = tmp;
        }
        return dist[dst] == Integer.MAX_VALUE ?
             -1 : dist[dst];
    }
    public static void main(String[] args) {
        int size = 4;
        int[][] flights = {
            {0, 1, 100},
            {1, 2, 100},
            {2, 0, 100},
            {1, 3, 600},
            {2, 3, 200}
        };
        int src = 0, dst = 3, stops = 1;
        System.out.println(cheap(size, flights, src, dst, stops));
    }
}
