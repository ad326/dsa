//Built in sorting (n log n)
import java.util.*;
public class builtIn {
    public static void main(String[] args) {
        Integer arr[]= {5,6,3,2,9,10};
        //sort from index 0 to 2
        Arrays.sort(arr,0,3); 
        System.out.println("After the sorting array by indexing: "+Arrays.toString(arr));
        //sort the whole array
        Arrays.sort(arr);  
        System.out.println("After sorting the whole Array: "+Arrays.toString(arr));
        //Reverse Sorting the array
        Arrays.sort(arr,Collections.reverseOrder());  //This function support "Integer" type array not "int" type
        System.out.println("After sorting in descending order: "+Arrays.toString(arr));

    }
}
