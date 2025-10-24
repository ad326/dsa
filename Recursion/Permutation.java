public class Permutation {
    public static void permutatuionOfString(String str, String permutation) {
        if(str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for(int i =0; i<str.length(); i++) {
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutatuionOfString(newStr, permutation + ch);
        }
    }
    public static void main(String[] args) {
        permutatuionOfString("abc", "");
    }
}
