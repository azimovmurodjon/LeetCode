package Week_7.Day_44;

import java.util.TreeMap;

public class Longest_Continuous_Subarray_With_Absolute_Diff_Less_Than_or_Equal_to_Limit_1438 {
    public int longestSubarray(int[] nums, int limit) {
        //Create a TreeMap to keep track of the frequency of each number
        TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();
        int maxLength = 0; //Stores the maximum length of the subarray
        int left = 0; //The left pointer for our slidding window

        //Iterate over the array using the right pointer 'right'
        for(int right = 0; right < nums.length; ++right){
            //Update the frequency of the current number
            frequencyMap.put(nums[right], frequencyMap.getOrDefault(nums[right], 0) + 1);

            //Shrink the sliding window untill the absolute diffrence between the max
            //and min within the window is less then or equal to 'limit'
            while (frequencyMap.lastKey() - frequencyMap.firstKey() > limit){
                //Decrease the frequency of the number at the left pointer
                frequencyMap.put(nums[left], frequencyMap.get(nums[left]) - 1);
                //if the frequency drops to zero, remove it from the frequency map
                if(frequencyMap.get(nums[left]) == 0){
                    frequencyMap.remove(nums[left]);
                }
                //Move thhe left pointer to the right, shrinking the window
                ++left;
            }

            //Upgrade the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }
        //Return the maximum length of the subarray that satisfies the condition
        return maxLength;
    }
}
