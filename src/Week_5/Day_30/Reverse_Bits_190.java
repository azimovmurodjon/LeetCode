package Week_5.Day_30;

public class Reverse_Bits_190 {
    public int reverseBits(int n) {
        int reverse = 0;

        for (int i = 0; i < 32; i++) {
            int bit = n & 1;
            n >>= 1;
            reverse |= bit;

            if (i < 31) reverse <<= 1;
        }

        return reverse;
    }
}
