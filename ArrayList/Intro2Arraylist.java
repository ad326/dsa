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

        for(int i = 2; i<11; i+=2) {
            list2.add(i);
        }

        for(int i = 1; i<10; i+=2) {
            list3.add(i);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);
    }
}
