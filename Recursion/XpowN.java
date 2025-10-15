public class XpowN {
    public static int optimizePow(int x, int n) { //O(logn)
        if(n == 0) {
            return 1;
        }
        int halfPower = optimizePow(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        //if n is odd
        if(n%2 !=0) {
            halfPowerSq*= x;
        }
        return halfPowerSq;
    }
    
    public static int powN(int x, int n) {  //O(n)
        if(n == 0) {
            return 1;
        }
         
        return x * powN(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println("The result is: "+powN(3, 10));
        System.out.println("The optimize result is: "+optimizePow(3, 10));
    }
}
