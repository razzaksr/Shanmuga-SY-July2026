package day14;

import java.util.Comparator;
import java.util.TreeSet;

public class HandsOnPojoCollect {
    public static void main(String[] args) {
        // custom sort via Comparator
        // TreeSet<Contact> whatsapp = new TreeSet<>(
        //     Comparator.comparing(Contact::getName)
        // );
        TreeSet<Contact> whatsapp = new TreeSet<>();
        whatsapp.add(new Contact("Venkat", 98765678L));
        whatsapp.add(new Contact("Vikas", 6545678765L));
        whatsapp.add(new Contact("Praveen", 654456787L));
        whatsapp.add(new Contact("Balaji", 876545678L));
        System.out.println(whatsapp);
    }
}
