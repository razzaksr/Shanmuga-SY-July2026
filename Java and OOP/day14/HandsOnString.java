package day14;

import java.util.Arrays;

public class HandsOnString {
    public static void main(String[] args) {
        String alpha = "Razak Mohamed";// literal object
        // non literal object
        String beta = new String("              Razak Mohamed   ");
        System.out.println(beta.length());
        beta = beta.trim(); // immutable
        System.out.println(beta.length());
        System.out.println(beta.equals("Razak Mohamed"));
        System.out.println(alpha=="Razak Mohamed");
        alpha = alpha.replace("Razak","Raqueeb");// immutable
        System.out.println(alpha.compareTo("Raqueeb Mohamed"));
        byte[] bytes = alpha.getBytes();
        System.out.println(Arrays.toString(bytes));
        char[] chars = alpha.toCharArray();
        System.out.println(Arrays.toString(chars));
        byte[] newBytes = {65,66,67,68,69,70};
        String zeta = new String(newBytes);
        System.out.println(zeta);
        char[] newChars = {122,121,120,119,118};
        String delta = new String(newChars);
        System.out.println(delta);// zyxwv
        System.out.println(delta.contains("y"));
    }
}
