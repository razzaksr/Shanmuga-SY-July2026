package day3;

public class ValidateParanStringViaGreedy {
    public static boolean validate(String exp){
        int open=0, close=0;
        char[] temp = exp.toCharArray();
        for(char each:temp){
            if(each=='('){open++;close++;}
            else if(each==')'){
                if(open>0)open--;
                close--;
            }
            else{
                if(open>0)open--;
                close++;
            }
            if(close<0) return false;
        }
        return open==0;
    }
    public static void main(String[] args) {
        System.out.println(validate("()"));
        System.out.println(validate("(((((*)))**"));
        System.out.println(validate("(****)("));
    }
}
