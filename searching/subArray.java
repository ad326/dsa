//Subarray of an array
import java.util.*;
public class subArray {
    public static void subarray(int arr[]){
        int i,j,k;

        for(i=0;i<=arr.length-1;i++){
            for(j=i;j<arr.length;j++){
                System.out.print("(");
                for(k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                }
                System.out.print(") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10};

        subarray(arr);

        System.out.println("The array is: "+Arrays.toString(arr));
    }
}
