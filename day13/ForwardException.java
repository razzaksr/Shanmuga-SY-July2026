package day13;

import java.util.Scanner;

public class ForwardException {
    public static void read(){
        int start=0, end=0;
        Scanner scan = new Scanner(System.in);
        String text = "AI agents increase your productivity";
        try{
            System.out.println("start, end pos to extract");
            start = scan.nextInt();end = scan.nextInt();
            System.out.println(text.substring(start,end));
        }catch(StringIndexOutOfBoundsException sin){
            System.out.println("Not handled in method");
            // forward exception to caller of this read method
            throw sin;
        }
        scan.close();
    }
    public static void main(String[] args) {
        try{
            read();
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e+" at main ");
            main(args);
        }
    }
}
