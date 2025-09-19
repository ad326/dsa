public class UpperToLower {
    public static char toLowerCase (char ch){
        if (ch>= 'A' && ch<='Z'){
            return (char)(ch | ' ');
        }
        return ch;
    }
    public static void main(String[] args) {
        String str = "Hello World!";
        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()){
            result.append(toLowerCase(ch));
        }

        System.out.println("Original: "+str);
        System.out.println("Lowercase: "+result);
    }
}
