package day15;

import java.util.ArrayDeque;
import java.util.Deque;

public class HandsOnDoublyQueue {
    public static void main(String[] args) {
        Deque dq = new ArrayDeque<>();
        dq.offerLast("NUnit");dq.offer(3.1);dq.offer(new int[]{45,92});
        dq.offerFirst('W');dq.offer(7.6F);
        System.out.println(dq);
        dq.pollLast();System.out.println(dq.peekLast());
        System.out.println(dq.contains(7.6F));
        dq.poll();// dq.pollFirst();
        System.out.println(dq.peek());// dq.peekfirst()
        // dq.parallelStream().forEach(System.out::println);
        dq.parallelStream().forEachOrdered(System.out::println);
    }
}
