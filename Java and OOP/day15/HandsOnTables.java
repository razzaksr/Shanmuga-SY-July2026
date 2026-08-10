package day15;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HandsOnTables {
    public static void main(String[] args) {
        Map<Long,Double> cards = new Hashtable<>();
        cards.putIfAbsent(98765676576567L, 0.0);
        cards.put(7654567654567L, 55000.0);
        cards.put(45678765678L, 91000.0);
        cards.put(34567876545678L, 78000.0);
        // System.out.println(cards.get(987654567876L));
        System.out.println(cards.getOrDefault(
            98765676576567L, 0.0));
        cards.put(98765676576567L, 78000.0);
        cards.remove(34567876545678L);
        System.out.println(cards.containsValue(78000.0));
        System.out.println(cards.containsKey(34567876545678L));
        Set<Long> customers =  cards.keySet();
        System.out.println("Credit card Customers are "+customers);
        Collection<Double> limits = cards.values();
        System.out.println("Customers limits are "+limits);
    }
}
