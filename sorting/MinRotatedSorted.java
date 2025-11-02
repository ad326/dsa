public class MinRotatedSorted {
    public static int minInRotatedSorted(int arr[], int min, int si, int ei) {

        if(si>=ei) return min;
        int mid = si + (ei - si)/2;

        if(arr[si]<= arr[mid]) {
            min = Math.min(arr[si], min);
            return minInRotatedSorted(arr, min, mid+1, ei);
        } else {
            min = Math.min(arr[mid], min);
            return minInRotatedSorted(arr, min, si, mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 9, -1, 0, 1, 2, 3, 4, 5, 6};
        System.out.println(minInRotatedSorted(arr, Integer.MAX_VALUE, 0, arr.length-1));
    }
}
