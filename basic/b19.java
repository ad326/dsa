// Sum of digit
public class b19 {
    public static int digSum(int n){
        int rem,rev=0;

        while(n>0){
            rem=n%10;
            rev+=rem;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n=123;
        System.out.println("The sum of digits of "+n+" is "+digSum(n));
    }
}
