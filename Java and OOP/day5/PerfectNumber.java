package day5;

public class PerfectNumber {
    public static boolean checkPerfectNumber(int number){
        if(number<=1) return false;
        int sum = 1;
        for(int index=2;index<=Math.sqrt(number);index++){
            if(number%index==0){
                sum+=index;
                sum += (index!=number/index)?number/index:sum;
            }
        }
        return sum==number;
    }
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
        System.out.println(checkPerfectNumber(7));
        System.out.println(checkPerfectNumber(8));
        System.out.println(checkPerfectNumber(6));
    }
}
