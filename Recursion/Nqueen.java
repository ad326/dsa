public class Nqueen {
    static int count = 0;
    public static boolean isSafe(char board[][], int row, int col) {
        int i,j;
        //up search
        for(i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //up left diagonal
        for(i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //up right diagonal
        for(i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char board[][], int row) {
        //base case
        if(row == board.length) {
            printBoard(board);
            count++;
            return;
        }

        //main body
        for(int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = '.';
            }
            
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----------------");
        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++ ){
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
        System.out.println("Total possibility: "+count);
    }
}
