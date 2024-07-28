package Week_10.Day_66;

import java.util.Arrays;
public class Sort_the_People_2418 {

    public String[] sortPeople(String[] names, int[] heights) {
        // Extract the number of elements from the names array, which also applies to the heights array.

        int numberOfPeople = names.length;
        // Create an array of indices representing each person.
        Integer[] indices = new Integer[numberOfPeople];

        // Initialize the indices array with values from 0 to numberOfPeople - 1.
        for (int i = 0; i < numberOfPeople; ++i) {
            indices[i] = i;
        }

        // Sort the indices array based on the descending order of heights using a custom comparator.
        // The comparator computes the difference between the heights at indices j and i.
        Arrays.sort(indices, (i, j) -> heights[j] - heights[i]);

        // Create a result array to store the sorted names based on the heights.
        String[] sortedNames = new String[numberOfPeople];

        // Build the result array by mapping sorted indices to their respective names.
        for (int i = 0; i < numberOfPeople; ++i) {
            sortedNames[i] = names[indices[i]];
        }

        // Return the array of names sorted by descending heights.
        return sortedNames;
    }
}
