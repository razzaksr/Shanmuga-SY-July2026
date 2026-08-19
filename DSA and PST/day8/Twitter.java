package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Twitter {
    private class Tweet{
        int id, time;
        Tweet(int id, int time){
            this.id = id;this.time=time;
        }
    }
    private static int timeStamp=0;
    private Map<Integer,List<Tweet>> tweetPool;
    private Map<Integer,Set<Integer>> followPool;
    public Twitter(){
        tweetPool = new HashMap<>();
        followPool = new HashMap<>();
    }
    public void postTweet(int uId,int twId){
        tweetPool.putIfAbsent(uId, new ArrayList<>());
        tweetPool.get(uId).add(new Tweet(twId, timeStamp++));
    }
    public List<Integer> getNewsFeed(int uId){
        PriorityQueue<Tweet> pq = new PriorityQueue<>((t1,t2)->t2.time-t1.time);
        // user's tweets
        if (tweetPool.containsKey(uId)) {
            pq.addAll(tweetPool.get(uId));
        }
        // followees' tweets
        if (followPool.containsKey(uId)) {
            for (int followee : followPool.get(uId))
                if (tweetPool.containsKey(followee)) pq.addAll(tweetPool.get(followee));
        }
        List<Integer> res = new ArrayList<>();
        int count = 0;
        while (!pq.isEmpty() && count < 10) {
            res.add(pq.poll().id);
            count++;
        }
        return res;
    }
    public void follow(int followerId, int followeeId) {
        followPool.putIfAbsent(followerId, new HashSet<>());
        followPool.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followPool.containsKey(followerId)) followPool.get(followerId).remove(followeeId);
    }
    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5);
        System.out.println(twitter.getNewsFeed(1));
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        System.out.println(twitter.getNewsFeed(1));
        twitter.unfollow(1, 2);
        System.out.println(twitter.getNewsFeed(1));
    }
}
