//Print matrix as spiral

public class spiral {
    public static void printSpiral(int mat[][]){
        int startRow=0;
        int startCol=0;
        int endRow=mat.length-1;
        int endCol=mat[0].length-1;

        while (startRow<=endRow && startCol<= endCol) {
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(mat[startRow][j]+" ");
            }

            //right
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(mat[j][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(mat[endRow][j]+" ");
            }

            //left
            for(int j=endRow-1;j>=startRow+1;j--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(mat[j][startRow]+" ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--; 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int mat[][]= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        printSpiral(mat);
    }
}
