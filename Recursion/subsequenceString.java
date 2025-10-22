public class subsequenceString {
    public static void subSequenceOfString(String str, int id, String newString) {
        if(id == str.length()) {
            System.out.println(newString);
            return;
        }

        subSequenceOfString(str, id+1, newString+str.charAt(id));
        subSequenceOfString(str, id+1, newString);
    }
    public static void main(String[] args) {
        subSequenceOfString("abc", 0, "");
    }
}
