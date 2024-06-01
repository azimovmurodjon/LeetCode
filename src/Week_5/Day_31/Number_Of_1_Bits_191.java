package Week_5.Day_31;

public class Number_Of_1_Bits_191 {
    public int hammingWeight(int n) {
        int ones = 0;

        while (n != 0) {
            n = n & (n - 1);
            ones++;
        }

        return ones;
    }
}
