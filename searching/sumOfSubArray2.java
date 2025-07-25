//Maximum Sum of Subarray (Prefix method)
import java.util.*;
public class sumOfSubArray2 {
    public static void subArray(int arr[]){
        int i,j,current,max=Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];

        for(i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(prefix));

        for(i=0;i<arr.length;i++){
            for(j=i;j<arr.length;j++){
                current= i==0? prefix[j] : prefix[j] - prefix[i-1];
                if(current>max){
                    max = current;
                }
            }
        }
        System.out.println("The maximum sum of array is: "+max);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        subArray(arr);
    }
}
