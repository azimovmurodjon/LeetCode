package Week_1.Day_2;

public class Richest_Customer_Wealth_1672 {
    public int maximumWealth(int[][] accounts){
        int maxWealthSoFar = 0;

        for(int[] customer : accounts){
            int currentCustomerWelth = 0;

            for(int bank : customer){
                currentCustomerWelth += bank;
            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWelth);
        }
        return maxWealthSoFar;
    }
}

/**
 * time complexity = 0(n x m)
 * space complexity = 0(1)
 */
