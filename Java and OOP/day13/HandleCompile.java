package day13;

import java.util.Arrays;

public class HandleCompile {
    public static void main(String[] args) {
        String[] algorithms = {"Two Pointers",
            "DFS","BFS","Intervals","Djikstra","Prims"};
        Arrays.stream(algorithms).forEach(each->{
            System.out.println(each);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
