// Check palindrome or not
public class b18 {
    public static int revNum(int n){
        int rev=0,rem;

        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }

    public static void checkRev(int n){
        
        if(n==revNum(n)){
            System.out.println(n+" is a palindrome number.");
        }else{
            System.out.println(n+" is not a palindrome number.");
        }
    }
    public static void main(String[] args) {
        checkRev(121);
    }
}
