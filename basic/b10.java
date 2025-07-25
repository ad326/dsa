//Factorial

public class b10 {
    public static void main(String[] args) {
        int num = 5;
        int i;
        int fact=1;

        for(i=2;i<=num;i++){
            fact*=i;
        }
        System.out.println("The factorial is: "+fact);
    }
}
