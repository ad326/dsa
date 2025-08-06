//String builder
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for(char ch ='a'; ch<='z'; ch++){ // O(26)
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}

//String Builder is more efficient the regular string. When we add any character on string, it copied previous string and add the character. For everytime it coppide the string in a new space. so, it consume storage and also time for copying the whole string. But in the case of string builder, it not happen. In my program the loop run 26 time. But if i use any normal string, the time complexity will be O(26 * n^2). Because, every time it copy the whole string.
