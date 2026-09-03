package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelay {
    public static int minTime(int[][] times, int size,
                                                int src){
        List<List<int[]>> grid = new ArrayList<>();
        for(int it=0;it<=size;it++)
            grid.add(new ArrayList<>());
        int[] dist = new int[size+1];
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)->Integer.compare(a[1], b[1])
        );
        for(int ind=0;ind<times.length;ind++){
            int[] cur = times[ind];
            grid.get(cur[0]).add(new int[]{cur[1],cur[2]});
        }
        pq.add(new int[]{src,0});
        Arrays.fill(dist,Integer.MAX_VALUE);dist[src]=0;
        while(!pq.isEmpty()){
            int[] polled = pq.poll();
            int node = polled[0], time=polled[1];
            if(time>dist[node]) continue;
            for(int[] nei:grid.get(node)){
                int dest = nei[0], wt = nei[1];
                if(dist[node]+wt<dist[dest]){
                    dist[dest] = dist[node]+wt;
                    pq.offer(new int[]{dest,dist[dest]});
                }
            }
        }
        int cost=-1;
        for(int ind = 1;ind<=size;ind++){
            if(dist[ind]==Integer.MAX_VALUE) return -1;
            cost = Math.max(cost, dist[ind]);
        }
        return cost;
    }
    public static void main(String[] args) {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int size = 4;
        int src = 2;
        System.out.println(minTime(times, size, src));
        times=new int[][]{
            {3,4,1},{2,3,2},{2,1,4}
        };
        System.out.println(minTime(times, 4, 3));
    }
}
