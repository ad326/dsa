//Tax Calculator
import java.util.*;
public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int income = sc.nextInt();
        float tax;

        if(income<=20000){
            tax = income;
        }else if(income<=30000){
            tax = (float) (income * 0.8);
        }else{
            tax = (float) (income * 0.7);
        }

        System.out.println("Your groce income is: "+tax);

        sc.close();
    }
}
