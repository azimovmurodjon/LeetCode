package Week_1.Day_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * Example 2:
 * <p>
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * Example 3:
 * <p>
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 104
 */
public class Fizz_Buzz_412 {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            boolean deviisbleBy3 = i % 3 == 0;
            boolean deviisbleBy5 = i % 5 == 0;

            if (deviisbleBy3 && deviisbleBy5) {
                answer.add("FizzBuzz");
            } else if (deviisbleBy3) {
                answer.add("Fizz");
            } else if (deviisbleBy5) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }

}

/*
Second Solutions
 */
class Solution{
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            boolean devisbleBy3 = i % 3 == 0;
            boolean devisbleBy5 = i % 5 == 0;

            String currStr =  "";
            if (devisbleBy3) {
                currStr += "Fizz";
            }
            if (devisbleBy5) {
                currStr += ("Buzz");
            }
            if (currStr.isEmpty()){
                currStr += String.valueOf(i);
            }
            answer.add(currStr);

        }
        return answer;
    }

}