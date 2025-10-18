public class CheckSorted {
    public static boolean isSorted(int arr[],int n) {
        if(n == 0 || n == 1) {
            return true;
        }

        return arr[n-1] >= arr[n-2] && isSorted(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(isSorted(arr, arr.length));

    }
}
