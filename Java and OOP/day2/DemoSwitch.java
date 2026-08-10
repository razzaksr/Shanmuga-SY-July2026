package day2;

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        int tenure=0; double cost=0, emi=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("the amount for EMI eligibilty");
        cost = scan.nextDouble();
        if(cost>=5000){
            System.out.println("eligible to convert"+
            cost+" into EMI");
            System.out.println("enter the desired tenure");
            tenure = scan.nextInt();
            switch (tenure) {
                case 12: case 3:case 6: case 9:
                    emi = (cost+(cost*0.05))/tenure;
                    System.out.println("ROI 5 percentage");
                    break;
                case 24: 
                    emi = (cost+(cost*0.10))/tenure;
                    System.out.println("ROI 10 percentage");
                    break;
                case 36: 
                    emi = (cost+(cost*0.15))/tenure;
                    System.out.println("ROI 15 percentage");
                    break;
                default:
                    System.out.println("Invalid tenure");
                    break;
            }
            System.out.println("Your repayment EMI "+emi);
        }else{
            System.out.println(cost+"is not eligible for EMI");
        }
    }
}
