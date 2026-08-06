package day13;

import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ip = "";int part = 0, cur=0;
        try{
            System.out.println("Enter the IP to validate ");
            ip = scan.next();
            String[] spilted = ip.split("\\.");
            while(part<4){
                cur = Integer.parseInt(spilted[part]);
                if(cur<0||cur>=256)
                    {System.out.println("Invalid IP");return;}
                part++;
            }
            System.out.println("IP is valid");
        }catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
            if(e.getClass().getName()=="java.lang.NumberFormatException")
                System.out.println("IP in numerical");
            else System.out.println("IP should be 4 portions of numbers");
            main(args);
        }
        scan.close();
    }
}
