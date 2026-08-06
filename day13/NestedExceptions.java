package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedExceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// new object
        int distance = 0, avg = 0;float eta=0;
        try{
            System.out.println("the distance to travel ");
            distance = scan.nextInt();
            System.out.println("the averge speed ");
            avg = scan.nextInt();
            eta = distance/avg;
            eta = (float)distance/avg;
            System.out.println("ETA: "+eta);
        }catch(InputMismatchException ins){
            System.out.println(ins);
            main(args);
        }catch(ArithmeticException ae){
            try{
                System.out.println("valid speed/ Non zero");
                avg = scan.nextInt(); eta = distance/avg;
                eta = (float)distance/avg;
                System.out.println("ETA: "+eta);
            }catch(InputMismatchException in){
                Scanner newScan = new Scanner(System.in);
                System.out.println("Speed Non zero number");
                avg = newScan.nextInt(); eta = distance/avg;
                eta = (float)distance/avg;
                System.out.println("ETA: "+eta);
            }
        }catch(Exception e)
            {System.out.println("Uncaught handled here");}
        scan.close();
    }
}
