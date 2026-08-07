package day14;

import java.util.ArrayList;
import java.util.Collections;

/*
Collections>> java.util
    sort,reverse, replaceAll, max, min
*/

public class HandsOnCollections {
    public static void main(String[] args) {
        ArrayList<Float> flt = new ArrayList<>();
        flt.add(5.6F);flt.add(8.1F);flt.add(7.1F);
        flt.add(9.2F);flt.add(5.6F);flt.add(21.9F);
        // Collections.sort(flt,(f1,f2)->f2.compareTo(f1));
        // flt.sort((f1,f2)->f2.compareTo(f1));
        Collections.reverse(flt);
        System.out.println(flt);
        System.out.println(Collections.max(flt));
        System.out.println(Collections.min(flt));
        Collections.replaceAll(flt,5.6F,1.1F);
        System.out.println(flt);
    }
}
