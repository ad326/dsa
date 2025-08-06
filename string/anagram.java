// Check two strings are anagram or not
import java.util.*;
public class anagram {
    public static String sortString(String str){
        str = str.toLowerCase();
        
        char tempArray[] = str.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }
    public static void main(String[] args) {
        String str = "Race";
        String str2 = "care";

        if(str.length() == str2.length()){
            str = sortString(str);
            str2 = sortString(str2); 
        
            if(str.equals(str2)){
                System.out.println("This strings are anagrams.");
            } else {
            System.out.println("This are not anagrams strings.");
            }
        }else{
            System.out.println("This are not anagrams strings.!!");
        }
        
    }
}
