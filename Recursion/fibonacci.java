public class Fibonacci {
    public static int fibonaci(int n){
        if(n == 0 || n ==1) {
            return n;
        }
        int fn = fibonaci(n-1) + fibonaci(n-2);
        return fn;
    }
    public static void main(String[] args) {
        System.out.println("The number is: "+fibonaci(5));
    }
}
