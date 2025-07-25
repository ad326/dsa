// Binomial coefficient
public class b13 {
    public static int fact(int a){
        int i, fact=1;

        for(i=2;i<=a;i++){
            fact*=i;
        }

        return fact;
    }

    public static float bino(int n, int r){
        float act;

        act = fact(n)/(fact(r) * fact(n-r));

        return act;
    }
    public static void main(String[] args) {
        int n=10,r=3;

        System.out.println("The binomial value is: "+bino(n, r));
    }
}
