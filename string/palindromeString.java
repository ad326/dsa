// Check a string palindrome or not
import java.util.*;
public class palindromeString {
    public static boolean palindromeInString(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("This word is not an palindrome");
                return false;
            }
        }
        System.out.println("This is a palindrome word");
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check palindrome or not: ");
        String str = sc.next();
        System.out.println("Your entered word is: "+str);
        palindromeInString(str);
        sc.close();
    }
}
