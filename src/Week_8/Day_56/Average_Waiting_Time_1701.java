package Week_8.Day_56;

public class Average_Waiting_Time_1701 {
    public double averageWaitingTime(int[][] customers) {
        double totalWaitingTime = 0; // Initialize total waiting time
        int currentTime = 0; // Initialize current time to track when the chef will be free

        // Iterate over each customer
        for (int[] customer : customers) {
            int arrivalTime = customer[0]; // Extract arrival time for the current customer
            int orderTime = customer[1];   // Extract order's cooking time for the current customer

            // Update current time: If the chef is free before the arrival, start at arrival time,
            // else start after finishing the last customer's order
            currentTime = Math.max(currentTime, arrivalTime) + orderTime;

            // Calculate waiting time for the current customer and add it to the total waiting time
            totalWaitingTime += currentTime - arrivalTime;
        }

        // Calculate the average waiting time by dividing the total waiting time by the number of customers
        return totalWaitingTime / customers.length;
    }
}
