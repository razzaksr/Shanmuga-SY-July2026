package day14;

public class Contact implements Comparable<Contact>{
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