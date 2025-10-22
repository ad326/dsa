public class Occurance {
    static int first = -1;
    static int last = -1;
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

    public static void firstLastOccurance(String str, int id, char ch) {
        if (id == str.length()) {
            System.out.println("The first occurance is in "+first+" index and last occurance is in "+last+" index.");
            return;
        }
        if(str.charAt(id) == ch ) {
            if(first == -1) {
                first =id;
            } else {
                last = id;
            }
        }
        firstLastOccurance(str, id+1, ch);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9,5,10};
        System.out.println("First Occurance is: "+firstOccurance(arr, 5, 0));
        System.out.println("Last Occurance is: "+lastOccurance(arr, 5, 0));
        firstLastOccurance("Bangladesh", 0, 'a');
    }
}
