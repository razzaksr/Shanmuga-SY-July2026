package day5;

import java.util.Arrays;

public class KthSmallestPrimFractionViaDC {
    // Time: O(n log(1/ε)) where ε is precision (binary search iterations).
    // Space: O(1).
    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double low = 0.0, high = 1.0;
        while (true) {
            double mid = (low + high) / 2.0;
            int count = 0;
            int p = 0, q = 1; // result fraction
            // two-pointer counting
            int j = 1;
            for (int i = 0; i < n - 1; i++) {
                while (j < n && arr[i] > mid * arr[j]) j++;
                if (j < n) {
                    count += n - j;
                    if (p * arr[j] < q * arr[i]) {
                        p = arr[i];
                        q = arr[j];
                    }
                }
            }
            if (count == k) return new int[]{p, q};
            else if (count < k) low = mid;
            else high = mid;
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(new int[]{1,2,3,5}, 3)));
    }
}
