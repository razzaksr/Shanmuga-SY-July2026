package day6;

public class BestTimeBuySell {
    public static int maxProfit(int[] arr){
        int buy = Integer.MAX_VALUE, sell=0;
        for(int each:arr){
            buy = Math.min(each, buy);
            sell = Math.max(sell, each-buy);
        }
        return sell;
    }
    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
    }
}
