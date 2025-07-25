//Max sum of subarray (Brute Force)
import java.util.*;
public class sumOfSubArray {
    public static void subArray(int arr[]){
        int i,j,k,Max=Integer.MIN_VALUE,temp;

        for(i=0;i<arr.length;i++){
            for(j=i;j<arr.length;j++){
                temp=0;
                System.out.print("( ");
                for(k=i;k<=j;k++){
                    System.out.print(arr[k]+", ");
                    temp+=arr[k];
                }
                System.out.print(") ");
                if(temp>Max){
                    Max=temp;
                }
            }
            System.out.println();
        }
        System.out.println("The max sum of subarray is: "+Max);
    }
    public static void main(String[] args) {
        
        int arr[] = {2,4,6,8,10};
        System.out.println("The array is: "+Arrays.toString(arr));
        subArray(arr);
    }
}
