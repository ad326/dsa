// Best time to buy and sell stock
import java.util.*;
public class stockMarket {
    public static void stockBuySell(int arr[]){
        int i,profit,max=Integer.MIN_VALUE,buyPrice=arr[0];
        
        for(i=1;i<arr.length;i++){
            if(buyPrice>arr[i]){
                buyPrice=arr[i];
            }
            profit = arr[i]-buyPrice;

            max=Math.max(max, profit);
        }
        System.out.println("The max profit is: "+max);
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println("The price list is: "+Arrays.toString(arr));
        stockBuySell(arr);
    }
}
