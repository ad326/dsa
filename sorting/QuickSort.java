import java.util.Arrays;
//Time complexity: O(n^2) || Space complexity: O(n)
public class QuickSort {
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, ei);
        return i;
    }

    public static void quickSort(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }

        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1); //left side
        quickSort(arr, pidx+1, ei); //right side
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr [b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        System.out.println("Before sorting: "+Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }
}
