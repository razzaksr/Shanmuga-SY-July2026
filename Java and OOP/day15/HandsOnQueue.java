package day15;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Queue:
    offer>> enque>> add
    poll>> dequeue>> delete
    peek>> top/first
    search
Deque:
    offerFirst
    offerLast
    peekFirst
    peekLast
    pollFirst
    pollLast
*/

public class HandsOnQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(45);que.offer(92);que.offer(128);que.offer(98);
        System.out.println(que.peek());
        Queue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());
        pQueue.addAll(que);
        // pQueue.forEach(System.out::println);
        while (pQueue.peek()!=null) {System.out.println(pQueue.poll());}
    }
}
