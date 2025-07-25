import java.util.*;
public class binary_search {
    public static int binary(int arr[], int item){
        int l=0,r=arr.length-1;
        int m;
        while(l<=r){
            m=(l+r)/2;
            if(arr[m]==item){
                return m+1;
            }else if(arr[m]>item){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the item you want ot search: ");
        int item = sc.nextInt();

        System.out.println("Your array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr); //sort array using library function
        System.out.println("\nAfter sorting array is: "+Arrays.toString(arr));//print array using library function
        

        int index = binary(arr, item);

        if(index==-1){
            System.out.println("\nThe item is not found!!!");
        }else{
            System.out.println("\nThe index of this item is: "+index);
        }

        sc.close();
    }
}
