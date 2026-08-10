package day12;

public class Objective {
    public static void main(String[] args) {
        String beta = null;
        try{
            System.out.println(beta.length());
        }catch(NullPointerException obj){
            obj.printStackTrace();// System.out.println(obj);
            beta="Razak";
            System.out.println(beta.length());
        }
        System.out.println("Length printed successfully");
    }
}
