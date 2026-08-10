package day6;

public class RemoveDuplicatesInSorted {
    public static int remove(int[] arr){
        if(arr.length==0) return 0;
        int index=0;
        for(int jack = 1;jack<arr.length;jack++){
            if(arr[index]!=arr[jack]){
                index++;
                arr[index]=arr[jack];
            }
        }
        return index+1;
    }
    public static void main(String[] args) {
        int[] test1 = {1,1,2};
        int[] test2 = {0,0,1,1,1,2,2,3,3,4};
        int[] test3 = {1,1,2};
        System.out.println(remove(test1));
        System.out.println(remove(test2));
        System.out.println(remove(test3));
    }
}

