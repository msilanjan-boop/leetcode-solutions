
class Main {

    static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] test1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test 1: " + maxProfit(test1));

        int[] test2 = {7, 6, 4, 3, 1};
        System.out.println("Test 2: " + maxProfit(test2));

        int[] test3 = {1, 2};
        System.out.println("Test 3: " + maxProfit(test3));

        int[] test4 = {5};
        System.out.println("Test 4: " + maxProfit(test4));
    }
}
