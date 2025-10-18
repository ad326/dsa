public class RecursiveBinarySearch {
    public static int binarySearch(int arr[], int tar, int str, int end) {
        if(str <= end) {
            int mid = (str + end)/2;
            if(arr[mid] == tar){
                return mid;
            }else if(arr[mid] < tar) {
                return binarySearch(arr, tar, mid+1, end);
            } else {
                return binarySearch(arr, tar, str, mid-1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("The position of target is: "+binarySearch(arr, 6, 0, arr.length-1));
    }
}
