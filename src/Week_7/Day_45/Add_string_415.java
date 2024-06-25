package Week_7.Day_45;

public class Add_string_415 {
    // Method to add two numeric strings
    public String addStrings(String num1, String num2) {
        // Pointers to the end of each string
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder answer = new StringBuilder();
        // Initialize carry to 0
        int carry = 0;

        // Process both strings from the end till both strings are processed or there is no carry left
        while(i >= 0 || j >= 0 || carry > 0) {
            // Get digit from string num1 if available, else use 0
            int digit1 = i < 0 ? 0 : num1.charAt(i) - '0';
            // Get digit from string num2 if available, else use 0
            int digit2 = j < 0 ? 0 : num2.charAt(j) - '0';
            // Calculate sum of digits and carry
            carry += digit1 + digit2;
            // Append the unit digit of sum to the answer
            answer.append(carry % 10);
            // Calculate new carry
            carry /= 10;
            // Move to the next digits in each string
            --i;
            --j;
        }

        // The answer is in reverse order, so reverse it to get the correct result
        answer.reverse();
        // Convert StringBuilder to String and return
        return answer.toString();
    }

    // Method to subtract two numeric strings
    public String subStrings(String num1, String num2) {
        int length1 = num1.length(), length2 = num2.length();
        // Check if the result will be negative
        boolean isNegative = length1 < length2 || (length1 == length2 && num1.compareTo(num2) < 0);
        // Swap numbers if the result is negative
        if (isNegative) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // Pointers to the end of each string
        int i = num1.length() - 1, j = num2.length() - 1;
        StringBuilder answer = new StringBuilder();
        // Initialize borrow to 0
        int borrow = 0;

        // Process the larger number from the end
        while(i >= 0) {
            // Subtract borrow and digit from num2 if available, else use 0, from the digit from num1
            borrow = (num1.charAt(i) - '0') - borrow - (j < 0 ? 0 : num2.charAt(j) - '0');
            // Handle negative results and prepare the next borrow if necessary
            answer.append((borrow + 10) % 10);
            borrow = borrow < 0 ? 1 : 0;
            // Move to the next digits
            --i;
            --j;
        }

        // Remove leading zeros from the answer
        while(answer.length() > 1 && answer.charAt(answer.length() - 1) == '0') {
            answer.deleteCharAt(answer.length() - 1);
        }

        // Append the negative sign if the result is negative
        if (isNegative) {
            answer.append('-');
        }

        // The answer is in reverse order, so reverse it to get the correct result
        answer.reverse();

        // Convert StringBuilder to String and return
        return answer.toString();
    }
}
