package day3;

import java.util.Scanner;

public class BitManipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println("enter the mumber ");
        num = scan.nextInt();
        // find odd or even using bitwise & 1
        if((num&1)==0) System.out.println("Even");
        else System.out.println("Odd");
        // positive into negative
        int result = ~num + 1;
        System.out.println(result);
        scan.close();
    }
}
