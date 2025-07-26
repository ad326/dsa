//Creating 2D array 
import java.util.*;
public class create2D {
    public static void main(String[] args) {
        
        int arr[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        int i,j,n=3,m=3;

        System.out.println("Enter the elements of array: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Your 2D array is: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
