import java.util.*;
public class string {
    public static void printLetter(String str){
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};

        //decleration of string
        String str = "abcd";
        String str2 = new String("xyz"); //Java's strings are immutable

        //Input and output in string
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); //count space as input
        System.out.println("Name : "+name);
        String address = sc.next();  //if find space then stop
        System.out.println("Address: "+address);

        System.out.println("Length of name: "+name.length()); //length of string

        //Concatenation
        String fName="Tony";
        String lName= "Stark";
        String fullName= fName+" "+lName;
        System.out.println(fullName);
        printLetter(fullName);

    }
}
