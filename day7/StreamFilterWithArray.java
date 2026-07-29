package day7;

import java.util.Arrays;

public class StreamFilterWithArray {
    public static void shortList(double[][] arr){
        for(double[] row:arr){
            double[] temp = Arrays.stream(row).
            filter(each->each>10.0).toArray();
            Arrays.stream(temp).forEach(
                data->System.out.println(data));
        }
    }
    public static void apprisal(double[][] arr){
        for(double[] row:arr){
            row=Arrays.stream(row).map(each->
                //{
                // if(each>10.0) each+=(each*0.05);
                // else each+=(each*0.100);
                // return each;
                //}
                each+=(each>10.0)?
                each*0.5:each*0.100
            ).toArray();
            System.out.println(Arrays.toString(row));
        }
    }
    public static void main(String[] args) {
        double[][] remuneration = {
            {9.2,12.6,7.8},
            {12.5,7.08,11.5,3.5},
            {9.3,3.5}
        };
        shortList(remuneration);
    }
}
