package day14;

import java.util.ArrayList;
import java.util.Vector;

/*
ArrayList:
    add, get, remove(pos/object)
*/

public class HandsOnListArray {
    public static void main(String[] args) {
        ArrayList arr1 = new ArrayList<>();
        arr1.add(12.5); arr1.add(98); arr1.add(true);
        arr1.add("JDBC");
        Vector arr2 = new Vector<>();
        arr2.addAll(arr1); System.out.println(arr2);
        arr2.set(2, 5.6);
        System.out.println(arr1.contains(true));
        arr1.remove("JDBC");
        System.out.println(arr1.indexOf("JDBC"));
        System.out.println("List 1 "+arr1);
        System.out.println("List 2 "+arr2);
        arr1.removeAll(arr2); System.out.println("List 1 "+arr1);
        arr2.retainAll(arr1); System.out.println("List 2 "+arr2);
    }
}

