package Week_6.Day_38;

public class Add_Digits_258 {
    public int addDigits(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;

        return num % 9;
    }
}
