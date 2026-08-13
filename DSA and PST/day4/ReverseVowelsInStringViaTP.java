package day4;

public class ReverseVowelsInStringViaTP {
    public static String reverse(String word){
        char[] arr=word.toCharArray();
        int start=0,end = arr.length-1;
        while(start<end){
            while(start<end&&
                "AEIOUaeiou".indexOf(arr[start])==-1)
                    start++;
            while(start<end&&
                "AEIOUaeiou".indexOf(arr[end])==-1)
                    end--;
            if(start<end){
                char temp= arr[start];
                arr[start] = arr[end];
                arr[end] = temp;start++;end--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        System.out.println(reverse("Race Car"));
        System.out.println(reverse("Ice Cream"));
        System.out.println(reverse("Leet Code"));
    }
}
