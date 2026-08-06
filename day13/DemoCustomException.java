package day13;

import java.util.Scanner;

class DenominationExcetion extends RuntimeException{
    public DenominationExcetion(){
        super("Invalid Denomination");// calling base constructor
        // super.members >> calling super class data member/methods
    }
}
public class DemoCustomException {
    public static void main(String[] args) {
        int required = 0;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("enter desired amount ");
            required = scanner.nextInt();
            if(required%500!=0) throw new DenominationExcetion();
            else System.out.println(required/500);
        }catch(DenominationExcetion dm){
            System.out.println(dm);
            main(args);
        }
    }
}
