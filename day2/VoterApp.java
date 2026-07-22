package day2;

import java.util.Scanner;

// validate name, mobile, aadhaar, pan, email
public class VoterApp {
    public static void main(String[] args) {
        String name="", pan="", email="", aadhaar="", mobile="";
        boolean isValid = true;
        Scanner sscet = new Scanner(System.in);
        System.out.println("enter the name ");
        name = sscet.nextLine();
        System.out.println("enter the email ");
        email = sscet.next();
        System.out.println("Mobile number ");
        mobile = sscet.next();
        System.out.println("enter aadhaar ");
        aadhaar = sscet.next();
        System.out.println("enter the PAN ");
        pan = sscet.next();
        if(!name.matches("^[A-Za-z ]{5,}$"))
        {isValid=false;System.out.println("Invalid Name");}
        if(!email.matches(
        "^[A-Za-z0-9_.-]{2,}@[A-Za-z]{3,}+\\.[a-z]{2,}$")
        )
        {isValid=false;System.out.println("Invalid email");}
        if(!mobile.matches("^[0-9]{10}$"))
            {isValid=false;System.out.println("Invalid mobile");}
        if(!aadhaar.matches("^[0-9]{12}$"))
            {isValid=false;System.out.println("Invalid aadhaar");}
        if(!pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$"))
            {isValid=false;System.out.println("Invalid PAN ");}
        if(isValid)
            System.out.println(name+
        " voter application submitted further updates send to "+
            mobile+" or "+email);
        else System.out.println("Application Rejected");
        sscet.close();
    }
}
