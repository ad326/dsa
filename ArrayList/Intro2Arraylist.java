import java.util.*;

public class Intro2Arraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<6; i++) {
            list1.add(i);
        }
        System.out.println(list1);

        for(int i = 2; i<11; i+=2) {
            list2.add(i);
        }
        System.out.println(list2);

        for(int i = 1; i<10; i+=2) {
            list3.add(i);
        }
        System.out.println(list3);
    }
}
