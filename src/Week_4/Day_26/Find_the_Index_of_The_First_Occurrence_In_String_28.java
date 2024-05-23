package Week_4.Day_26;

public class Find_the_Index_of_The_First_Occurrence_In_String_28 {
    public static void main(String[] args) {
        System.out.println(strStr("leetcode","leeto"));
    }
    static int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {

                if (haystack.substring(i, needle.length() + i).equals(needle)) {

                    return i;
                }
            }

        }
        return -1;
    }

}
