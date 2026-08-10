package day3;

import java.util.Scanner;

public class BitManipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println("enter the mumber ");
        num = scan.nextInt();
        // // find odd or even using bitwise & 1
        // if((num&1)==0) System.out.println("Even");
        // else System.out.println("Odd");
        // // positive into negative
        // int result = ~num + 1;
        // System.out.println(result);
        // check the given is power of two
        // if(num>0&&(num&(num-1))==0)
        //     System.out.println("true");
        // else 
        //     System.out.println("false");

        //check given is power of 4
        if(num>0&&(num&(num-1))==0&&(num-1)%3==0)
            System.out.println("true");
        else System.out.println("false");
        scan.close();
    }
}
