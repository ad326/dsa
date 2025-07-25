// Trapping Rain Water
import java.util.*;
public class trappingRaindrop {
    public static void trapping(int arr[]){
        int i,total=0;
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length];

        leftMax[0]=arr[0];
        for(i=1;i<arr.length;i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        rightMax[arr.length-1]=arr[arr.length-1];
        for(i=arr.length-2; i>=0;i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int waterLevel=0;
        for(i=0;i<arr.length;i++){
            waterLevel = Math.min(leftMax[i], rightMax[i]);
            total = total + (waterLevel-arr[i]);
        }

        System.out.println("The total amount of waterdrop is: "+total);

    }
    public static void main(String[] args) {
        
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println("The array is: "+Arrays.toString(arr));
        trapping(arr);
    }
}
