//Reverse a given string using Recursion
public class ReverseString {
    public static void reverseString(String str, int id) {
        if (id == str.length()) {
            return;
        }
        reverseString(str, id+1);
        System.out.print(str.charAt(id));
    }
    public static void main(String[] args) {
        String str = "Computer";
        reverseString(str, 0);
    }
}
