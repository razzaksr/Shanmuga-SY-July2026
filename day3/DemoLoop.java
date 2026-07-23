package day3;

import java.util.Scanner;

public class DemoLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limit=0, number = 0, prev1=Integer.MIN_VALUE;
        int prev2 = Integer.MIN_VALUE;
        System.out.println("let us know limit ");
        limit = scan.nextInt();// 10
        while(limit>0){
            System.out.println("enter the number ");
            number = scan.nextInt();
            if(prev1<number){prev2 = prev1;prev1 = number;}
            else if(prev2<number&&number!=prev1)
                prev2=number;
            limit--;
        }
        System.out.println(prev1+" "+prev2);
        scan.close();
    }
}
