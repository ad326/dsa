public class practiceRecursion {
    //Count of all contiguous substrings starting and ending with the same character.
    public static int countSubstrings(String s, int i, int j, int n) {
        
        if (n == 1) return 1;  
        if (n <= 0) return 0;

        int res = countSubstrings(s, i + 1, j, n - 1)
                + countSubstrings(s, i, j - 1, n - 1)
                - countSubstrings(s, i + 1, j - 1, n - 2);

        if (s.charAt(i) == s.charAt(j))
            res++;

        return res;
    }

    //Find the length of a given string
    public static int length(String str) {
        if(str.length() ==0) {
            return 0;
        }
        return length(str.substring(1)) +1;
    }

    //Conver Interger number to String
    public static void NumberToString(int n, String arr[], StringBuilder str) { 
        if(n == 0) {
            return;
        }
        int n1 = n%10;
        
        NumberToString(n/10, arr, str);
        str.append(arr[n1]);
    }

    //Print the Occurance of a number in a given array
    public static void Occurance(int i, int key, int arr[]) {
        if(i == arr.length) {
            return;
        }

        if(arr[i] == key) {
            System.out.print(i+" ");
        }

        Occurance(i+1, key, arr);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        Occurance(0, 2, arr);
        System.out.println();
        String num[] = {"Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};
        StringBuilder str = new StringBuilder();
        NumberToString(1902, num, str);
        System.out.println(str);
        System.out.println("The length of this String is: "+ length(str.toString()));
        String s = "abcab";
        int n = s.length();

        System.out.println("The number of Combination is: "+countSubstrings(s, 0, n - 1, n));
    }
}
