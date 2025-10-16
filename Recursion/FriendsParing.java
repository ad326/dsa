//Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. ind out the total number of ways in which friends can remain single or can be paired up.
public class FriendsParing {
    public static int pairsPossibility(int n) {
        if(n == 1 || n == 2) {
            return n;
        }

        return pairsPossibility(n-1) + (n-1) * pairsPossibility(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Possible way of pairs is: "+ pairsPossibility(4));
    }
}
