// Decimal to Binary
public class b17 {
    public static int decToBin(int n){
        int rem, binNum=0,pow=0;

        while(n>0){
            rem = n%2;
            binNum+=(rem*Math.pow(10, pow++));
            n=n/2;
        }

        return binNum;
    }
    public static void main(String[] args) {
        int n=11;
        System.out.println("The binary value is: "+decToBin(n));
    }
}
