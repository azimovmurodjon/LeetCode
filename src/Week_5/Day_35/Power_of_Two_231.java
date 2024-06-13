package Week_5.Day_35;

public class Power_of_Two_231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        return (n & (n - 1)) == 0;
    }
}
