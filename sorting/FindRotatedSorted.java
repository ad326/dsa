public class FindRotatedSorted {
    public static boolean findInRotatedSorted(int arr[], int target, int si, int ei) {
        if(si>ei) {
            return false;
        }
        
        int mid = si + (ei-si)/2;

        if(arr[mid] == target) return true;

        if(arr[si] == arr[mid] && arr[mid] == arr[ei]) {
            return findInRotatedSorted(arr, target, si+1, ei-1);
        } else if(arr[si] <= arr[mid]) {
            if(arr[si] <= target && target < arr[mid]) {
                return findInRotatedSorted(arr, target, si, mid-1);
            } else {
                return findInRotatedSorted(arr, target, mid+1, ei);
            }
        } else {
            if(arr[mid] < target && target <= arr[ei]) {
                return findInRotatedSorted(arr, target, mid+1, ei);
            } else {
                return findInRotatedSorted(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
       int arr[] = {3, 3, 1, 2, 3, 3, 3, 3}; 
       System.out.println(findInRotatedSorted(arr, 1, 0, arr.length-1));
    }
}
