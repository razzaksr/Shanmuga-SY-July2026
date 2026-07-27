package day5;

public class Store {
    static String[] skills = {"spring boot","    django   ",
    "hibernate","junit","fastapi","webapi","entityframework"};
    public static String findMax(){
        int maxIndex = Integer.MIN_VALUE;
        for(int index=0;index<skills.length-1;index++){
            if(skills[index].length()>skills[index+1].length())
                maxIndex = index;
            else maxIndex=index+1;
        }
        return skills[maxIndex];
    }
    public static void main(String[] args) {
        String maxString = Store.findMax();
        System.out.println(maxString);
    }
}
