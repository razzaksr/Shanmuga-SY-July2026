package day14;

import java.util.LinkedList;
import java.util.List;

/*
List>> add, remove, get, set, contains, replaceAll, removeAll,
LinkedList: CRUD >> positoins starts from 0... size
    add/ addLast, addFirst, add(pos,obj)
    getFirst, getLast, get(pos)
    set(pos,obj)
    removeFirst/remove, removeLast, remove(pos)
*/

public class HandsOnLinked {
    public static void main(String[] args) {
        LinkedList link1 = new LinkedList();// non generic
        // List link1 = new LinkedList();// non generic, upcasting/ factory pattern
        link1.add(false);link1.addLast("Flask API");
        link1.addFirst(12.5);link1.add(new Character('R'));
        link1.add(2, "Apache Maven");
        System.out.println(link1);
        link1.remove();
        System.out.println(link1.getFirst());
        link1.set(2, true);
        System.out.println(link1.get(3));
        System.out.println(link1.removeLast());
        link1.forEach(System.out::println);
    }
}
