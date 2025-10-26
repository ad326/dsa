// Insertion Sort
import java.util.*;
public class InsertionSort {
    public static void insertion(int arr[]){
        int i,j,temp;

        for(i=1;i<arr.length;i++){
            temp=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {5,4,1,3,2};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
