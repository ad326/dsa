//Diagonal Sum
import java.util.*;
public class digonalSum {
    public static void diagonalSum(int mat[][]){
        int sum=0;
        int i=0;
        while(i<mat.length){
            sum+=mat[i][i];  //Calculate primary diagonal sum
            if(i != mat.length-1-i){  // For ignoring common element in odd squar matrix
                sum+=mat[i][mat.length-1-i]; //Calculate secondary diagonal sum
            }
            i++;
        }

        System.out.println("The diagonal sum is: "+sum);
    }
    public static void main(String[] args) {
        int mat[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(Arrays.deepToString(mat)); //Print 2D Array as matrix
        diagonalSum(mat);
    }
}
