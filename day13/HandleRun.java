package day13;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleRun {
    public static void main(String[] args) {
        int[] values = {12,34,44,55,98,120,256}; int user = 0;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter the value to search ");
            user = scan.nextInt();
        }catch(InputMismatchException ins){
            Scanner newScan = new Scanner(System.in);
            System.out.println("Enter number value search ");
            user = newScan.nextInt();
        }
        System.out.println(Arrays.binarySearch(values, user));
        scan.close();
    }
}
