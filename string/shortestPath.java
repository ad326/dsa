// Assume i have a compass direction in string. (north,south,east,west). Now I have to find the shortest path from the (0,0) position
import java.util.*;
public class shortestPath {
    public static void distance(String str){
        int x=0,y=0;
        double distance=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'N'){
                y++;
            }else if(str.charAt(i) == 'S'){
                y--;
            }else if(str.charAt(i) == 'E'){
                x++;
            }else{
                x--;
            }
        }
        distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("The shortest path is: "+distance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the direction as (NWSES)");
        String str = sc.next();
        distance(str);

        sc.close();
    }
}
