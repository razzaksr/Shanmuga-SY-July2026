package day1;

import java.util.Scanner;

public class KYC {
    public static void main(String[] args) {
        // Classname objectName = new Classname();
        Scanner shanmuga = new Scanner(System.in);
        String name="", pan="",address="";long aadhaar=0L,mobile=0L;
        System.out.println("Welcome to Shanmuga Bank");
        System.out.println("Let me know your name ");
        name = shanmuga.nextLine();
        System.out.println("Let me know the address ");
        address = shanmuga.nextLine();
        System.out.println("Enter the PAN card ");
        pan = shanmuga.next();
        System.out.println("Mobile number ");
        mobile = shanmuga.nextLong();
        System.out.println("enter the aadhaar ");
        aadhaar = shanmuga.nextLong();
        System.out.println("KYC has submitted by "+name
                        +" further updates you get "+mobile);
    }
}
