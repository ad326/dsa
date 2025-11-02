public class MajorityElement {
    private static int countApp(int arr[], int num, int lo, int hi) {
        int count =0;
        for(int i = lo; i<= hi; i++){
            if(arr[i] == num) count++;
        }
        return count;
    }
    private static int majorityElementRec(int arr[], int lo, int hi) {

        if(lo == hi) return arr[lo];

        int mid = lo + (hi - lo)/2;

        int left = majorityElementRec(arr, lo, mid);
        int right = majorityElementRec(arr, mid+1, hi);

        if(left == right) return left;

        int nLeft = countApp(arr, left, lo, hi);
        int nRight = countApp(arr, right, lo, hi);

        return nLeft > nRight ? left : right;
    }

    public static int majority(int arr[]) {
        return majorityElementRec(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majority(nums));
    }
}
