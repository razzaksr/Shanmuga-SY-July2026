package day5;

public class DemoMembers {
    String companies="tcs,cts,capgemini,mindtree";
    public static void main(String[] args) {
        DemoMembers demo = new DemoMembers();// object
        String[] splited = demo.companies.split(",");
        System.out.println(splited.length);
        Phone phone1 = new Phone();
        phone1.model = "Edge 60";
        phone1.brand = "Motorola";
        phone1.cost = 18000;
        phone1.ram = 8;
        Phone phone2 = new Phone();
        phone2.model = "T4";phone2.brand = "Vivo";
        phone2.cost = 22000; phone2.ram=8;

        System.out.println(phone1.brand);
        System.out.println(phone2.brand);
    }
}
class Phone{
    String model;
    int cost;
    int ram;
    String brand;
}