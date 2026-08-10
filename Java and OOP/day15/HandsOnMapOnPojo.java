package day15;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import day14.Contact;

public class HandsOnMapOnPojo {
    public static void main(String[] args) {
        Map<Contact, String> app = new TreeMap<>(
            Comparator.comparing(Contact::getName)
        );
        app.put(new Contact("Karthick", 87656787656L), "Google");
        app.put(new Contact("Lasyan", 5678987654567L), "Phone");
        app.put(new Contact("Anudeep", 654567876544L), "Whatsapp");
        app.put(new Contact("Hemanth", 876567876745L), "SIM");
        app.put(new Contact("Udhay", 456787654567L), "Whatsapp");
        app.put(new Contact("Rohit", 6545678765678L), "SIM");
        app.put(new Contact("Vaishnavi", 76545678765L), "Phone");
        app.put(new Contact("Akshaya", 987656787678L), "Whatsapp");
        // entrySet which returns Map.Entry<Contact,String> in this context
        app.entrySet().forEach(each->
            System.out.println(each.getKey()+" "+each.getValue()));
    }
}
