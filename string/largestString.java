// largest string (Lexicographic method)
public class largestString {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];

        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println("The largest string is: "+largest);
    }
}
// comareTo --> a and A are different value
// compareToIgnoreCase --> a and A are same value