//Given a "2 x n" board and tiles o size "2x1", count the number o ways to tile the given board using the 2x1 tiles. (A tile can either be placed horizontally or vertically)
public class TilingProblem {
    public static int tiling(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        return tiling(n-1) + tiling(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Total number of Tile need: "+tiling(5));
    }
}
