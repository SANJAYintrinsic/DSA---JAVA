public class BuySellStock {

    public static int maxProfit(int[] prices) {

        // Buy on the first day initially
        int minimumPrice = prices[0];

        // No profit at the beginning
        int maximumProfit = 0;

        // Start checking from the second day
        for (int i = 1; i < prices.length; i++) {

            // If today's price is smaller,
            // buy at today's price
            if (prices[i] < minimumPrice) {
                minimumPrice = prices[i];
            }

            // Calculate profit if we sell today
            int profit = prices[i] - minimumPrice;

            // Update maximum profit
            if (profit > maximumProfit) {
                maximumProfit = profit;
            }
        }

        return maximumProfit;
    }

    public static void main(String[] args) {

        int prices[] = {7, 1, 5, 3, 6, 4};

        int answer = maxProfit(prices);

        System.out.println("Maximum Profit = " + answer);
    }
}
