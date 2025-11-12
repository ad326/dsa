//Bubble Sort
import java.util.*;
public class BubbleSort {
    public static void sorting(int arr[]){
        int i,j,temp;
        boolean swap = false;
        
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap=true;
                    temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swap==false){
                break;
            }
        }
        if(swap==false){
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
