package day5;

public class MinInSortNRotatedViaDC {
    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right])
                left = mid + 1; // min is in right half
            else right = mid; // min is in left half
        }
        return nums[left];
    }
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{11,12,13,14}));
        System.out.println(findMin(new int[]{3,4,5,1,2}));
    }
}
