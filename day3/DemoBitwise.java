package day3;

// Bitwise Operators: & | ^ >> <<
public class DemoBitwise {
    public static void main(String[] args) {
        char beta=122; int delta = 'A';// type casting
        System.out.println(beta^delta);
        System.out.println(beta&'d');
        System.out.println(delta|592);
        System.out.println(beta<<3);
        System.out.println(delta>>6);
    }
}
