//Bubble Sort
import java.util.*;
public class bubbleSort {
    public static void sorting(int arr[]){
        int i,j,temp,swap=0;
        
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap++;
                    temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swap==0){
                break;
            }
        }
        if(swap==0){
            System.out.println("The array is already sorted!!!");
        }else{
            System.out.println("After sorting array is: "+Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        System.out.println(Arrays.toString(arr));
        sorting(arr);
    }
}
