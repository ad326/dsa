// Binary to decimal conertion
public class b16 {
    public static int binToDec(int n){
        int r,c=0,i=0;

        while(n!=0){
            r=n%10;
            n=n/10;
            c+=r*Math.pow(2,i++);
        }
        return c;
    }
    public static void main(String[] args) {
        int n = 1111;
        System.out.println("The decimal value is: "+binToDec(n));
    }
}
