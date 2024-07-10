package Week_9.Day_57;

public class Crawler_Log_Folder_1598 {
    public int minOperations(String[] logs) {
        // Initialize the steps counter to 0.
        int steps = 0;

        // Iterate through each log entry.
        for (String log : logs) {
            // If the log entry is "../", move one directory up.
            if ("../".equals(log)) {
                // Ensure that steps cannot be negative.
                steps = Math.max(0, steps - 1);
                // If the log entry is not a "." or "..", move one directory deeper.
            } else if (!"./".equals(log)) {
                // Increment the steps counter.
                ++steps;
            }
            // No action required for "./" as it means stay in the current directory.
        }
        // Return the minimum number of operations to end up back at the main folder.
        return steps;
    }
}
