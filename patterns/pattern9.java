// Butterfly Pattern
public class pattern9 {
    public static void main(String[] args) {
        int n =5;
        int i,j;

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(j=1;j<=(n-i)*2;j++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(j=1;j<=(n-i)*2;j++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
