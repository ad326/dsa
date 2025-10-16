public class RemoveDuplicate {
    public static void removeDuplicate(String str, int id, StringBuilder newStr, boolean map[]) {
        if(id == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currentChar = Character.toLowerCase(str.charAt(id));

        if(map[currentChar-'a'] == true) {
            removeDuplicate(str, id+1, newStr, map);
        }else {
            map[currentChar-'a'] = true;
            removeDuplicate(str, id+1, newStr.append(currentChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "Google";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
