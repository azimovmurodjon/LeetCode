package Week_4.Day_27;

public class Single_Number_136 {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num: nums) {
            result ^= num;
        }

        return result;
    }
}
