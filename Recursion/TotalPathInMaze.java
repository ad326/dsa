public class TotalPathInMaze {
    public static int countPath(int i, int j, int n, int m) {
        if(i == n || j == m) {
            return 0;
        }
        if(i == n-1 && j == m-1) {
            return 1;
        }

        return countPath(i+1, j, n, m) + countPath(i, j+1, n, m);
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("The total number of Path: "+countPath(0, 0, n, m));

    }
}
