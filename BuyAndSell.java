public class BuyAndSell {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // best time to buy
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // sell now
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BuyAndSell solution = new BuyAndSell();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println("Max profit for prices1: " + solution.maxProfit(prices1)); // Output: 5
        System.out.println("Max profit for prices2: " + solution.maxProfit(prices2)); // Output: 0
    }
}
