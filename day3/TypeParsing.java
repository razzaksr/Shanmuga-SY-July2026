package day3;

// Convert from String to other types
// using desired convertable wrapper class's parse method
public class TypeParsing {
    public static void main(String[] args) {
        String strWt = "64.10", strHt="158";
        // double bmi = (double)strWt/(double)(strHt*strHt);
        // camelNotation
        double weight = Double.parseDouble(strWt);
        int height = Integer.parseInt(strHt);
        double ht = (double)height/100;
        double bmi =(double) (weight/(ht*ht));
        System.out.println("Your BMI "+bmi);
    }
}
