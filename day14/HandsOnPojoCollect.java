package day14;

import java.util.Comparator;
import java.util.TreeSet;

class Contact implements Comparable<Contact>{
    private String name;private Long number;
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public Long getNumber() {return number;}
    public void setNumber(long number) {this.number = number;}
    public Contact(String name, long number)
        {this.name = name;this.number = number;}
    @Override
    public String toString()    
    {return "Contact [name=" + name + ", number=" + number + "]\n";}
    @Override
    public int compareTo(Contact o) {
        return o.getNumber().compareTo(this.getNumber());
    }
}

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
