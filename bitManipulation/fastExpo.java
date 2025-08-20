// Fastes way to calculate exponentional (O(log(n)))
public class fastExpo {
    public static int fastExpol(int n,int pow){
        int ans =1;

        while (pow>0) {
            if((pow & 1) != 0){  //Check LSB
                ans*=n;
            }
            n*=n;
            pow = pow>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpol(2, 5));
    }
}
