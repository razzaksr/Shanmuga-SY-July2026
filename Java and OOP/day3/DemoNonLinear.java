package day3;

import java.util.Scanner;

public class DemoNonLinear {
    public static void main(String[] args) {
        int mBalance = 20000, count=0;
        Scanner scanner = new Scanner(System.in);
        int required = 0;
        while(mBalance>=500){
            System.out.println("Required amount:");
            required = scanner.nextInt();
            if(required<=mBalance){
                if(required%500==0){
                    mBalance-=required;
                    System.out.println(required+" dispensed");
                    count++;
                }else System.out.println("Invalid denom");
            }else
                System.out.println("Insufficient in machine");
        }
        System.out.println(count+" withdrawls made");
        scanner.close();
    }
}
