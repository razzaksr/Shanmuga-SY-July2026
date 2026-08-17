package day6;

public class RobHouseViaDPTabular {
    public static int robMax(int[] arr){
        if(arr==null||arr.length==0) return 0;
        if(arr.length==1) return arr[0];
        int prev1=Math.max(arr[0],arr[1]),prev2=arr[0];
        for(int ind=2;ind<arr.length;ind++){
            int sum = Math.max(prev1, prev2+arr[ind]);
            prev2 = prev1;
            prev1 = sum;
        }
        return prev1;
    }
    public static void main(String[] args) {
        System.out.println(robMax(new int[]{2,1,1,2}));
        System.out.println(robMax(new int[]{100,10,1,10,100}));
    }
}
