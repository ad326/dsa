import java.util.*;

public class IntroArraylist {
    public static void main(String[] args) {

        //Initialization of arraylist
        ArrayList<Integer> list = new ArrayList<>();

        //Add elements
        list.add(1); //O(1)
        list.add(1,2); //O(n)

        for(int i = 0 ; i<5; i++) {
            list.add(3+i);
        }

        System.out.println(list);

        //Get elements
        System.out.println(list.get(4)); //O(1)

        //Remove elements
        list.remove(3);   //O(n)
        System.out.println(list);

        //Set elements
        list.set(3, 4); //O(n)
        System.out.println(list);

        //Search elements
        System.out.println(list.contains(4)); //O(n)

        //Size of arraylist
        System.out.println("The size of this arrayList is: "+list.size());

        //Sorting arrayList
        Collections.sort(list);
        System.out.println("After sorting arraylist is: "+list);

        //Sorting is descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After sorting in descending order: "+list);

    }
}
