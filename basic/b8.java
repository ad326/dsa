//Reverse a number
import java.util.*;
public class b8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        int num=0;

        while(n>0){
            num= (num*10) + (n%10);
            n = (int) (n/10);
        }

        System.out.println("The reverse number is: "+num);

        sc.close();
    }
}
