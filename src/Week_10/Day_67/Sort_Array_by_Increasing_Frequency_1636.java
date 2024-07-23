package Week_10.Day_67;

import java.util.ArrayList;
import java.util.List;

public class Sort_Array_by_Increasing_Frequency_1636 {
    public int[] frequencySort(int[] nums) {
        // Array to keep track of the frequency of each number.
        // Since the range of numbers is from -100 to 100, an offset of 100 is used
        // to map them to indices 0 to 200.
        int[] frequency = new int[201];
        // Transform the input array into a list to facilitate custom sorting.
        List<Integer> transformedList = new ArrayList<>();

        // Count frequencies and populate the list.
        for (int num : nums) {
            num += 100; // Apply offset to handle negative values.
            ++frequency[num]; // Increment frequency count for this number.
            transformedList.add(num); // Add to transformed list.
        }

        // Sort the list first by frequency, then by value if frequencies are equal.
        transformedList.sort((a, b) ->
                // If frequencies are the same, sort in descending order of the values (b - a).
                // Otherwise, sort by ascending order of frequencies (cnt[a] - cnt[b]).
                frequency[a] == frequency[b] ? b - a : frequency[a] - frequency[b]
        );

        // Create an array to store the sorted values.
        int[] sortedArr = new int[nums.length];
        int i = 0;
        // Populate the sortedArr with sorted values from the list,
        // converting them back by removing the offset of 100.
        for (int val : transformedList) {
            sortedArr[i++] = val - 100;
        }
        return sortedArr; // Return the sorted array.
    }
}
