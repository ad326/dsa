public class swapByBit {
    public static void main(String[] args) {
        int x =3, y = 4;
        System.out.println("Before swaping: x = "+x+" & y = "+y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After swaping: x = "+x+" & y = "+y);
    }
}
