package day4;

import java.util.Scanner;

public class EndOfSeasonSale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double time = 21.00;
        int required = 0, payable = 0, stock = 20, invoices = 0;
        while(stock>0&&time<=21.45){
            System.out.println("Let us know quantity ");
            required = scan.nextInt();
            if(required<=stock){
                System.out.println("enter the amount to pay ");
                payable = scan.nextInt();
                if(payable>=(required*25600))
                {stock-=required;invoices++;}
                else System.out.println("Insufficient to buy");
            }else System.out.println("Available "+stock);
            time+=0.01;
        }
        System.out.println("Invoice's "+invoices);
        scan.close();
    }
}
