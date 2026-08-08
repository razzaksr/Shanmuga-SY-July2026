package day15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
Map:
    adding/ update:
        put(k,v)
        putAll/ addAll
        putIfAbsent(key,action)
    read:
        get(key)
        getOrDefault(key,action)
        containsKey(key)
        containsValue(value)
        keySet()>> Set  >> returns key objects alone from map
        values()>> Collection >> returns value object alone from map
        entries() >> Map.Entry >> returns Keyobject, ValueObject>> (k,v)
                                >> getKey(), getValue()
        iterator, forEach, sout
    deletion:
        remove(key)

*/

public class HandsOnMap {
    public static void main(String[] args) {
        Map<String,List<Double>> itrs = new LinkedHashMap<>();
        Map<String,List<Double>> returns = new HashMap<>();
        Map<String,List<Double>> files = new TreeMap<>();
        Map<String,List<Double>> forms = new Hashtable<>();
        itrs.put("razaksr", List.of(1.9,2.4,4.5,6.2,8.9,7.4,6.6,11.40));
        itrs.put("manoj", List.of(8.9,12.0,6.7));
        itrs.put("vikas", List.of(1.9,2.4,4.5,6.2,8.9,7.4,6.6,11.40));
        itrs.put("razaksr", List.of(4.5,9.2));
        forms.putAll(itrs); returns.putAll(itrs); files.putAll(itrs);
        System.out.println("LinkedMap "+itrs);
        System.out.println("Hash "+returns);
        System.out.println("Table "+forms);
        System.out.println("Tree "+files);
    }
}
