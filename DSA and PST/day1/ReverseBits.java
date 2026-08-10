package day1;

public class ReverseBits {
    public static int reverse(int number){
        int result=0;
        for(int times=1;times<=32;times++){
            result <<= 1;
            result |= (number&1);
            number >>= 1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverse(20));
    }
}
