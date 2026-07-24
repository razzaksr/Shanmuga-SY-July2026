package day4;

import java.util.Scanner;

public class DemoPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = 0; char alpha = 'Z';
        System.out.println("Enter the limit ");
        limit = scanner.nextInt();
        for(int row=1;row<=limit;row++){
            for(int space=limit;space>row;space--)
                System.out.print(" ");
            for(int column=1;column<(row*2);column++)
                {System.out.print(alpha);alpha--;}
            System.out.println();
        }
        scanner.close();
    }
}
