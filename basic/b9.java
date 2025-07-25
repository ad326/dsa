//Prime number
import java.util.*;
public class b9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int flag=0;
        int i=2;

        while(i<=Math.sqrt(n)){
            if(n%i==0){
                flag = 1;
                break;
            }
            i++;
        }

        if(flag==1){
            System.out.println("This is not a prime number.");
        }else{
            System.out.println("This is a prime number.");
        }
        sc.close();
    }
}
