import java.util.Arrays;
import java.util.Scanner;
 
public class B433 {
    public static int[] mergeSort(int[] arr) {
        // Base case: arrays with 0 or 1 element are already sorted
        if (arr.length <= 1) {
            return arr;
        }
 
        // Divide the array into two halves
        int mid = arr.length / 2;
        int[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
        int[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);
 
        // Recursively sort both halves and store the returned arrays
        int[] sortedLeft = mergeSort(leftHalf);
        int[] sortedRight = mergeSort(rightHalf);
 
        // Merge the two sorted arrays and return the result
        return merge(sortedLeft, sortedRight);
    }
 
    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
 
        // Compare elements from both arrays and add the smaller one
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }
 
        // Copy any remaining elements from the left array
        while (i < left.length) {
            merged[k++] = left[i++];
        }
 
        // Copy any remaining elements from the right array
        while (j < right.length) {
            merged[k++] = right[j++];
        }
 
        return merged;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] cost=new int[n];
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
 
        }
        int[] sorted = mergeSort(cost);
 
        long[] prefix1 = new long[n + 1];
        long[] prefix2 = new long[n + 1];
 
        for (int i = 0; i < n; i++) {
            prefix1[i + 1] = prefix1[i] + cost[i];
            prefix2[i + 1] = prefix2[i] + sorted[i];
        }
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int type = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
 
            long sum;
 
            if (type == 1) {
                sum = prefix1[r] - prefix1[l - 1];
            } else {
                sum = prefix2[r] - prefix2[l - 1];
            }
 
            System.out.println(sum);
        }
    }
}