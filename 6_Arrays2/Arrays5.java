public class Arrays5 {
    public static int buyAndSellStocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0;i<prices.length;i++){
            if(buyprice<prices[i]){ //here we will get the profit
                int profit = prices[i]- buyprice; // to kknow about today's profit
                maxprofit = Math.max(maxprofit, profit) ;//global profit
            } else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println("Max profit is : "+buyAndSellStocks(prices));
    }
}
 // TC = O(N)