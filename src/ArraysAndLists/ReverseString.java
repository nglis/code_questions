package ArraysAndLists;

public class ReverseString {

    // The solution function is a C/C++ implementation of the solution
    // The reversed function (Java) below provides same time and space complexity

    /* public String solution(String str) {
        void reverse(char *str) {
            char* end;
            char tmp;

            if (str) {
                while (*end) {
                    ++end;
                }
                --end;
                while (str < end) {
                    tmp = *str;
                    *str++ = *end;
                    *end-- = tmp;
                }
            }
        }
    } */

    public String reversed(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        return new String(chars);
    }

}
