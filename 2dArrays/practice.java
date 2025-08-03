import java.util.*;
public class practice {
    public static void transposeMatrix(int array[][]){
        int mat[][] = new int[array[0].length][array.length];
        for(int i =0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                mat[j][i]=array[i][j];
            }
        }
        System.out.println("Your Original matrix is: "+Arrays.deepToString(array));
        System.out.println("Transpose matrix is: "+Arrays.deepToString(mat));
    }
    public static void sumOfRow(int array[][], int row){
        int sum = 0;
        for(int i=0; i<array[row].length; i++){
            sum+=array[row][i];
        }
        System.out.println("The sum of row "+row+" is: "+sum);
    }

    public static void findNumber(int array[][], int key){
        int flag = 0;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(array[i][j] == key){
                    flag++;
                }
            }
        }
        System.out.println("The number of "+key+"'s is: "+flag);
    }

    public static void main(String[] args) {
        int array[][]={
            {4,7,8},
            {8,8,7}
        };
        int key=8;

        int array2[][]=  {{1,4,9},{11,4,3},{2,2,3} };
        int row=2;

        //findNumber(array, key);
        //sumOfRow(array2, row-1);
        transposeMatrix(array);
    }
}
