// Search element in an sorted 2D array/matrix. Time complexity O(n+m)
public class searchSorted {
    public static boolean stairCaseSearch(int mat[][], int key){ //staircase (top right approach)
        int row=0,col=mat[0].length-1;

        while(row<mat.length && col>=0){
            if(mat[row][col] == key){
                System.out.println("Found key at ("+row+","+col+")");
                return true;
            }
            else if(key<mat[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("The key is not found");
        return false;
        
    }
    public static boolean stairCaseSearch2(int mat[][],int key){ //bottom left approach
        int row=mat[0].length-1,col=0;

        while(row>=0 && col<mat.length){
            if(mat[row][col]==key){
                System.out.println("Found key at ("+row+","+col+")");
                return true;
            }else if(key>mat[row][col]){
                col++;
            }else{
                row--;
            }
        }
        System.out.println("The key is not found");
        return false;
    }
    public static void main(String[] args) {
        int mat[][]={{10, 20, 30, 40},
                    {15, 25, 35, 45},
                    {27, 29, 37, 48},
                    {32, 33, 39, 50}};
        int key =33;

        stairCaseSearch(mat, key);
        stairCaseSearch2(mat, key);
    }
}
