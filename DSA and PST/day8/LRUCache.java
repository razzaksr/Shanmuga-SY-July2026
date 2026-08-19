package day8;

import java.util.LinkedHashMap;

public class LRUCache extends 
                LinkedHashMap<Integer,Integer> {
    private final int capacity;
    public LRUCache(int size){
        super(size,0.75f,true);
        capacity = size;
    }
    @Override
    protected boolean removeEldestEntry(
            java.util.Map.Entry<Integer, Integer> eldest) {
        return size()>capacity;
    }
    public void put(int key,int value)
        {super.put(key,value);}
    public int get(int key)
        {return super.getOrDefault(key, -1);}
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
