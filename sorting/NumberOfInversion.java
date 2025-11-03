public class NumberOfInversion {

    private static int mergei(int arr[], int si, int mid, int ei) {
        int invCount = 0;
        int i = si;
        int j = mid;
        int k = 0;
        int temp[] = new int[(ei-si+1)];

        while((i < mid) && (j<=ei)) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid-i);
            }
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for(k = 0, i = si; i <= ei; k++, i++) {
            arr[i] = temp[k];
        }

        return invCount;
    }

    private static int mergeSorte(int arr[], int si, int ei) {
        int invCount = 0 ;

        if(ei > si) {
            int mid = si + (ei - si)/2;

            invCount = mergeSorte(arr, si, mid);
            invCount += mergeSorte(arr, mid+1, ei);
            invCount += mergei(arr, si, mid+1, ei);
        }

        return invCount;
    }

    public static int getInersion(int nums[]) {
        return mergeSorte(nums, 0, nums.length-1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5};

        System.out.println(getInersion(arr));
    }
}
