import java.util.Arrays;
//time complexity: O(log n) || space complexity: O(n)
//Depth first search approach 
public class MergeSort {
    public static void mergeSort(int arr[], int st, int en) {
        if(st >= en) {
            return;
        }

        int mid = st + (en - st)/2;
        mergeSort(arr, st, mid);
        mergeSort(arr, mid+1, en);

        merge(arr, st, mid, en);
    }

    public static void merge(int arr[], int st, int mid, int en) {
        int temp[] = new int[en-st+1];
        int i = st;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= en) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of the 1st sorted part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        //for leftover elements of the 2nd sorted part
        while(j <= en) {
            temp[k++] = arr[j++];
        }

        //Copy to the main array
        for(k=0, i=st; k<temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        System.out.println("Before sorting: "+Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        System.out.println("After sorting: "+Arrays.toString(arr));
    }
}
