public class Occurance {
    public static int firstOccurance(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }

        if(arr[i] == key) {
            return i;
        }

        return firstOccurance(arr, key, i+1);
    }

    public static int lastOccurance(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }

        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void firstLastOccurance(int first, int last, String str, int id) {
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9,5,10};
        System.out.println("First Occurance is: "+firstOccurance(arr, 5, 0));
        System.out.println("Last Occurance is: "+lastOccurance(arr, 5, 0));
    }
}
