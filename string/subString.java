//Substring
public class subString {
    public static String substring(String str, int si, int ei){
        String sub="";
        for(int i=si; i<ei; i++){
            sub += str.charAt(i);
        }
        return sub;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";

        System.out.println("The substring is: "+substring(str, 0, 5));

        System.out.println(str.substring(0,5)); //Built in function
    }
}
