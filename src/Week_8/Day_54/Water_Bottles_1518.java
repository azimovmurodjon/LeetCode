package Week_8.Day_54;

public class Water_Bottles_1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        // Initialize totalDrunkBottles with the number of bottles we start with
        int totalDrunkBottles = numBottles;

        // Continue the process as long as we have enough empty bottles to exchange
        while (numBottles >= numExchange) {
            // Calculate the number of new bottles we can get by exchanging
            int newBottles = numBottles / numExchange;

            // Update the count of total drunk bottles with the new bottles
            totalDrunkBottles += newBottles;

            // Update the current number of bottles we have,
            // Including the new bottles and the bottles left after the exchange
            numBottles = newBottles + (numBottles % numExchange);
        }

        // Return the total number of drunk bottles
        return totalDrunkBottles;
    }
}
