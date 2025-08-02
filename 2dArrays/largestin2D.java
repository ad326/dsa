//Largest number in 2D array
import java.util.*;
public class largestin2D {
    public static void printMat(int mat[][]){  //Print matrix function
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void largestValue(int mat[][]){
        int large = Integer.MIN_VALUE;   //Assign smallest value in "largest" variable
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]>large){
                    large=mat[i][j];
                }
            }
        }
        System.out.println("The largest value of this matrix is: "+large);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();
        int mat[][] = new int[row][col];

        System.out.println("Enter the elements of matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your matrix is: ");
        printMat(mat);

        largestValue(mat);
        sc.close();
        
    }
}
