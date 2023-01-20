import java.util.*;
// In insertion sort steps get reduced when array is sorted
// No of steps is reduced as compared to bubble sort
// works good when array is partially sorted
public class insertionSort {
    // Time complexity
    // Best case : O(n^2)
    // Worst case : O(n)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = in.nextInt();
        }
        insertion(ar);
        System.out.println(Arrays.toString(ar));
    }
    static void insertion(int[] ar){
        for(int i=0; i<ar.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(ar[j] < ar[j-1]){
                    swap(ar, j, j-1);
                }else{
                    break; // since if the before element is smaller than the after element that means the array is already sorted.
                }
            }
        }
    }
    static void swap(int[] ar, int first, int second){
        int temp = ar[first];
        ar[first] = ar[second];
        ar[second] = temp;
    }
}
