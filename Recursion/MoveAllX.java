public class MoveAllX {
    public static void moveAllX(String str,int id, int count, String newStr) {
        if(id == str.length()) {
            for(int i =0; i<count; i++) {
                newStr+= 'x';
            }
            System.out.println("The final String is: "+newStr);
            return;
        }

        if(str.charAt(id) == 'x') {
            count++;
            moveAllX(str, id+1, count, newStr);
        } else {
            newStr+= str.charAt(id);
            moveAllX(str, id+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        moveAllX("Axbcxxdx", 0, 0, "");
    }
}
