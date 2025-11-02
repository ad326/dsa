import java.util.Arrays;

public class PracticeSorting {
    public static void mergeSorti(String arr[], int si, int ei) {
        if(si>=ei) return;

        int mid = si + (ei-si)/2;

        mergeSorti(arr, si, mid);
        mergeSorti(arr, mid+1, ei);
        mergi(arr, si, mid, ei);

    }

    public static void mergi(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei) {
            if(arr[i].compareTo(arr[j]) < 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        //left elements
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        //right elements
        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        //Copy temp arrays elements to the main array
        for(k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        System.out.println("Before sorting: "+Arrays.toString(arr));

        mergeSorti(arr, 0, arr.length-1);
        System.out.println("After sorting: "+Arrays.toString(arr));
    }
}
