//pairs in array
import java.util.*;
public class pairs {
    public static void pairsA(int arr[]){
        int i,j,k=0;
        for(i=0;i<arr.length-1;i++){
            for(j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                k++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs is: "+k);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        System.out.println("The pairs are: ");
        pairsA(arr);
    }
}
