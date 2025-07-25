//Find duplicate value in an array
import java.util.*;
public class duplicate {
    public static boolean findDuplicate(int arr[]){
        int i,j;
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]== arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4};

        System.out.println(findDuplicate(arr));
    }
}
