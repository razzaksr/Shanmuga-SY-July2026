package day7;

import java.util.Arrays;

public class Demo2DArray {
    public static void traverse(double[][] arr){
        // int rSize = arr.length;
        // for(int row=0;row<rSize;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println();
        // }
        // for(int row=0;row<rSize;row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }
        // for(double[] each:arr){
        //     // System.out.println(Arrays.toString(each));
        //     System.out.println(Arrays.toString(each));
        // }
        Arrays.stream(arr).forEach(
            each->System.out.println(
                Arrays.toString(each))
        );
    }
    public static void main(String[] args) {
        double[][] salary = {
            {3.4,9.2,12.5},
            {1.9,5.6,25.9,4.5},
            {22.5,4.1},
            {7.3,3.8,4.1,8.5,32.8,12.5,17.9,1.5}
        };
        traverse(salary);
        System.out.println(salary[0][0]+" "+salary[1][0]+" "+salary[2][0]);
        double[][] asset = new double[3][2];
        asset[0] = new double[]{9.3,12.5};
        asset[1] = new double[]{8.4,6.7};
        asset[2] = new double[]{45.3,76.5};
        // traverse(asset);

    }
}
