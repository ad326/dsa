//Print largest numbers between 3 numbers
public class b4 {
    public static void main(String[] args) {
        int a= 15;
        int b= 12;
        int c= 40;

        if(a>=b && a>=c){
            System.out.println("The largest number is: A");
        }else if(b>=a && b>=c){
            System.out.println("The largest number is: B");
        }else{
            System.out.println("The largest number is: C");
        }
    }
}
