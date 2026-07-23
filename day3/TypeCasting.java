package day3;

public class TypeCasting {
    public static void main(String[] args) {
        // String contactName = "Sabarinathan";
        // System.out.println(contactName.toLowerCase());
        // Object obj1 = contactName;// upcasting
        // // since Object doesn't have upper case method
        // // System.out.println(obj1.toUpperCase());
        // System.out.println(obj1);
        // obj1 = 12.5;// upcasting
        // System.out.println(obj1);
        // Object obj2 = false;
        // Boolean data = (Boolean) obj2;// down casting
        // System.out.println(data);
        // casting between data types
        // long zeta = 88L; char alpha = '\0';
        // alpha = (char)zeta;// type casting long to char
        // System.out.println(alpha);
        // short micro = 92;int fella = 0;
        // fella = micro;
        // float seek = 0.0F;seek = micro;
        // byte sigma = 0; sigma = (byte) micro;
        // System.out.println((int)'R');
        char check = 'R', match = 'a';
        check = (char)(check^match);
        match = (char)(check^match);
        check = (char)(check^match);
        System.out.println(check+" "+match);
    }
}
