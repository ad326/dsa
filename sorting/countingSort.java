//Counting Sorting
import java.util.*;
public class CountingSort {
    public static void counting(int arr[]){
        int largest = Integer.MIN_VALUE;
        int i,j;
        //Determine the largest value of this array
        for(i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1]; //Create count array

        //Frequency count
        for(i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //System.out.println(Arrays.toString(count));
        j=0;
        //sorting
        for(i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }
        System.out.println("After sorting the array is: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]= {5,1,7,9,10,3,6,2,3,4,5,5};
        System.out.println("The original array is: "+Arrays.toString(arr));
        counting(arr);
    }
}
