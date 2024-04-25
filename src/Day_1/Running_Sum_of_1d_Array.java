package Day_1;

/**
 * 1480. Running Sum of 1D Array Solution
 */
public class Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        results[0] = nums[0];

        for (int i = 1;i < nums.length; i++){
            results[i] = nums[i] + results[i - 1];
        }
        return results;
    }
}
//second Solution
class solution{
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
/**
 * time complexity = 0(n)
 * space complexity = 0(1)
 */
