package Week_8.Day_51;

public class Three_Consecutive_Odds_1550 {
    // Method to check if there are any three consecutive odd numbers in the array
    public boolean threeConsecutiveOdds(int[] arr) {
        // Initialize a counter for consecutive odd numbers
        int consecutiveOddsCount = 0;

        // Loop through each value in the array
        for (int value : arr) {
            // If the value is odd (remainder of division by 2 is 1), increment the counter
            if (value % 2 == 1) {
                consecutiveOddsCount++;
            } else {
                // If the value is not odd, reset the counter to 0
                consecutiveOddsCount = 0;
            }

            // If we have found 3 consecutive odd numbers, return true
            if (consecutiveOddsCount == 3) {
                return true;
            }
        }
        // If no three consecutive odd numbers were found, return false
        return false;
    }
}
