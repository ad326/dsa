// Prime number using function
public class b14 {
    public static boolean prime(int n){

        if(n==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=5;

        if(prime(n)){
            System.out.println("This is a prime number");
        }else{
            System.out.println("This is not a prime number");
        }
    }
}
