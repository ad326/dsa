public class SearchRotatedSorted {

    public static int searchInSortedRotated(int arr[], int target, int si, int ei) {

        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // Left half sorted
        if (arr[si] <= arr[mid]) {
            if (target >= arr[si] && target < arr[mid]) {
                return searchInSortedRotated(arr, target, si, mid - 1);
            } else {
                return searchInSortedRotated(arr, target, mid + 1, ei);
            }
        }
        // Right half sorted
        else {
            if (target > arr[mid] && target <= arr[ei]) {
                return searchInSortedRotated(arr, target, mid + 1, ei);
            } else {
                return searchInSortedRotated(arr, target, si, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,1,2,3,4};
        System.out.println(searchInSortedRotated(arr, 1, 0, arr.length-1));
    }
}
