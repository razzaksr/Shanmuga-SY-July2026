package day12;

import java.util.Scanner;

public class Revoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 0 to 4
        double[] arr = {12.9,9.2,5.6,14.5,7.2};
        System.out.println("enter the index to read ");
        int index = scanner.nextInt();
        try{
            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException ain){
            ain.printStackTrace();
            System.out.println("enter the index between 0 to 4 ");
            index = scanner.nextInt();
            System.out.println(arr[index]);
        }finally{
            System.out.println("Fetched successfully");
        }
        scanner.close();
    }
}
