package day13;

import java.util.Scanner;

public class InfiniteChances {
    public static void handling(){
        int start=0, end=0;
        Scanner scan = new Scanner(System.in);
        String text = "AI agents increase your productivity";
        try{
            System.out.println("start, end pos to extract");
            start = scan.nextInt();
            end = scan.nextInt();
            System.out.println(text.substring(start,end));
        }catch(StringIndexOutOfBoundsException sin){
            System.out.println("between 0 and "+text.length());
            handling();
        }
        scan.close();
    }
    public static void main(String[] args) {
        handling();
    }
}
