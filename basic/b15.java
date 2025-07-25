// Prime in range
public class b15 {
    public static boolean prime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void prime_in_range(int a, int b){
        System.out.println("The prime numbers are in range "+a+" to "+b+" are:");
        for(int i=a; i<=b;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int a =5, b =20;

        prime_in_range(a, b);
    }
}
