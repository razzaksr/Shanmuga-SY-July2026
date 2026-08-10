package day14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Set:
    add, contains, retainAll, removeAll, remove(obj), isEmpty, clear, size
*/

public class HandsOnSets {
    public static void main(String[] args) {
        Set<Double> set1 = new LinkedHashSet<>();
        Set<Double> set2 = new HashSet<>();
        Set<Double> set3 = new TreeSet<>((d1,d2)->d2.compareTo(d1));
        set1.add(1.2);set1.add(5.7);set1.add(2.3);set1.add(9.2);
        set2.addAll(set1);
        set3.addAll(set1);
        System.out.println("LinkedHash "+set1);
        System.out.println("Hash "+set2);
        System.out.println("Tree "+set3);
    }
}
