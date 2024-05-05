package Week_2.Day_11;

import java.util.LinkedList;
import java.util.List;

public class Plus_One_66 {
    public int[] plusOne(int[] digits) {
        List<Integer> results = new LinkedList<>();
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            carry = (sum > 9) ? 1 : 0;
            results.add(0, sum % 10);
        }

        if (carry > 0) results.add(0, 1);

        return results.stream().mapToInt(x -> x).toArray();
    }
}
