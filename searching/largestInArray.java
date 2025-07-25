//Largest number in the array
import java.util.*;
public class largestInArray {
    public static int largestValue(int arr[]){
        int max=Integer.MIN_VALUE; // -infinity

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array's elements: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Your array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nThe max value of this array is: "+largestValue(arr));

        sc.close();
    }
}
