package day6;

public class ClimbViaRecursion {
    public static int climb(int stairs){
        return (stairs<=0)?0:(stairs==1)?1:
        (stairs==2)?2:
        climb(stairs-1)+climb(stairs-2);
    }
    public static void main(String[] args) {
        System.out.println(climb(5));
        System.out.println(climb(8));
        System.out.println(climb(44));
    }
}
