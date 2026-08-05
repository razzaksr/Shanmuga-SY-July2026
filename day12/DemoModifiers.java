package day12;

import day11.AbstractionViaClass;
// import day11.Warehouse; // not visible since its default

// public class DemoModifiers extends Halloween {
public class DemoModifiers extends Crypto {
    // final methods can't be overriden
    // public int encode(int data){
    //     return data<<8;
    // }
    public static void main(String[] args) {
        AbstractionViaClass obj = new AbstractionViaClass();
        obj.fraudDetection(); obj.viewStatement();
        // Warehouse ware = new Warehouse();
        Halloween hall = new Halloween();
        hall.greet();
        DemoModifiers demo = new DemoModifiers();
        System.out.println(demo.encode(12));
    }
}
