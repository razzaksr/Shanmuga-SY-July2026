package day14;

import java.util.LinkedList;
import java.util.ListIterator;

public class HandsOnArrList {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        link.add("false");link.add(new String("Hibernate"));
        link.add("JUnit");link.add("Cypress");link.add("26");
        link.sort((obj1,obj2)->obj2.compareTo(obj1));
        // System.out.println(link);
        // link.forEach(System.out::println);
        // ListIterator<String> it = link.listIterator();// forward
        ListIterator<String> it = link.listIterator(link.size());// backward
        // while (it.hasNext()) System.out.println(it.next());
        while (it.hasPrevious()) System.out.println(it.previous());
    }
}
