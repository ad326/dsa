// Maximum sum of subarray (Kadane's algorithm)
import java.util.*;
public class sumOfSubArray3 {
    public static void subArraySum(int arr[]){
        int i,current=0,maxi=Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++){
            current+=arr[i];
            if(current<0){
                current=0;
            }
            if(current>maxi){
                maxi=current;
            }
        }
        System.out.println("The maximum sum of subarray is: "+maxi);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        System.out.println(Arrays.toString(arr));
        subArraySum(arr);
    }
}
