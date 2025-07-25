//Leap year or not
public class b7 {
    public static void main(String[] args) {
        int year = 2024;

        if(year%4!=0){
            System.out.println("Not a leap year");
        }else if(year%100==0 && year%400!=0){
            System.out.println("Not a leap year");
        }else{
            System.out.println("This is a leap year");
        }
    }
}
