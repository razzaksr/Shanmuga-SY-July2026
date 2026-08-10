package day5;

import java.util.Scanner;

public class HappyNumber {
    public int digSum(int number){
        int sum = 0;
        while(number>0){
            int digit = number%10;
            sum+=digit*digit;
            number/=10;
        }
        return sum;
    }
    public boolean isHappy(int number){
        int init = number;
        int next = digSum(number);
        while(next!=1&&init!=next){
            init = digSum(init);
            next = digSum(digSum(next));
        }
        return next==1;
    }
    public static void main(String[] args) {
        HappyNumber hNumber=new HappyNumber();
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        System.out.println(hNumber.isHappy(digit));
        scanner.close();
    }
}
