package day5;

import java.util.Arrays;

public class Passing {
    public void suggest(double[] list){
        for(double each:list){
            if(each>=4.5&&each<=10) 
                System.out.println("eligible 7L in 15% ROI");
            else if(each>10&&each<=25.1)
                System.out.println("Business loan 20L 8%");
            else
                System.out.println("PL 2L in 27% interest");
        }
    }
    public void deduct(double itr){
        itr = (itr>12&&itr<=20)?itr-=(itr*0.10):
        (itr>20&&itr<=25)?itr-=(itr*0.200):
        (itr>25)?itr-=(itr*0.300):itr;
        System.out.println("Deuducted "+itr);
    }
    public void ordering(double[] salary){
        Arrays.sort(salary);
    }
    public static void main(String[] args) {
        double[] annual = {12.5,9.2,7.5,45.8,2.1};
        Passing pass = new Passing();
        pass.suggest(annual);
        pass.deduct(annual[3]);
        System.out.println(Arrays.toString(annual));
        pass.ordering(annual);
        System.out.println(Arrays.toString(annual));
    }
}
