// Selection Sort
import java.util.*;
public class selectionSort {
    public static void Selection(int arr[]){
        int i,j,temp,min;

        for(i=0;i<arr.length-1;i++){
            min=i;
            for(j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("After sorting array is: \n"+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        
        int arr[] = {5,4,1,3,2};
        System.out.println(Arrays.toString(arr));
        Selection(arr);
    }
}
