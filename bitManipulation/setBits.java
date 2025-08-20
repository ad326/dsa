// Count how many 1 exist in bits of a number
public class setBits {
    public static int countSetOfBits(int n){
        int count=0;
        while(n!=0){  // log(n)
            if((n & 1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("The number of 1's in this number is: "+countSetOfBits(15));
    }
}
