public class lone{
    public static void main(String[] args) {
        int prices[] = {7 , 1 , 5 , 3 , 6 , 4};
        int maxProfit = 0;
        int buyPrice = prices[0];

        for(int i = 1 ; i<prices.length ;  i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit , profit);
            }else{
                buyPrice = prices[i];
            }
        }

        System.out.println(maxProfit);


        // int prices[] = {7 , 1 , 5 , 3 , 6 , 4};
        // int maxProfit = 0;
        // int buyPrice = Integer.MAX_VALUE;

        // for(int i = 0 ; i<prices.length ;  i++){
        //     if(buyPrice < prices[i]){
        //         int profit = prices[i] - buyPrice;
        //         maxProfit = Math.max(maxProfit , profit);
        //     }else{
        //         buyPrice = prices[i];
        //     }
        // }

        // System.out.println(maxProfit);
    }
}