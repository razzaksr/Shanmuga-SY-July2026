package day4;

import java.util.Scanner;

public class IntToRoman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Decimal ");
        int number = 0; 
        number = scan.nextInt();
        String roman = "";
        while(number>=1000){roman+="M";number-=1000;}
        if(number>=900){roman+="CM";number-=900;}
        while(number>=500){roman+="D";number-=500;}
        if(number>=400){roman+="CD";number-=400;}
        while(number>=100){roman+="C";number-=100;}
        if(number>=90){roman+="XC";number-=90;}
        if(number>=50){roman+="L";number-=50;}
        if(number>=40){roman+="XL";number-=40;}
        while(number>=10){roman+="X";number-=10;}
        if(number>=9){roman+="IX";number-=9;}
        if(number>=5){roman+="V";number-=5;}
        if(number>=4){roman+="IV";number-=4;}
        while(number>=1){roman+="I";number--;}
        System.out.println(roman); // return roman
        scan.close();
    }
}
