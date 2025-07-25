import java.util.*;
public class linear_search {
    public static int linearSearch(int arr[], int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the item you want to search: ");
        int item= sc.nextInt();

        int a = linearSearch(arr, item);

        if(a==-1){
            System.out.println("The item is not found!!!");
        }else{
            System.out.println("The item found in "+a+" position.");
        }

        sc.close();
    }
}
