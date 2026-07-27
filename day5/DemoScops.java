package day5;

public class DemoScops {
    public static void main(String[] args) {
        LoanCalculator razak = new LoanCalculator();
        razak.principle=250000;razak.roi = 9.1;
        razak.tenure = 36; 
        LoanCalculator vinod = new LoanCalculator();
        vinod.principle=100000;vinod.roi = 16.1;
        vinod.tenure = 48; //vinod.calculate();
        //razak.calculate();
        System.out.println(vinod.emi);
        System.out.println(razak.emi);
    }
}
class LoanCalculator{
    double principle;
    double roi;
    static double emi;
    int tenure;
    void calculate(){
        int year = tenure/12;
        emi = ((principle*roi/100)*year)/tenure;
    }
}
