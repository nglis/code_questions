package ArraysAndLists;

public class StringRotation {

    public Boolean solution(String s1, String s2) {
        int len = s1.length();

        if (len == s2.length() && len > 0) {
            String s1s1 = s1 + s1;
            return isSubstring(s1s1, s2);
        }

        return false;
    }

    public Boolean isRotation(String s1, String s2) {
        int len = s1.length();

        if (len != s2.length() || len == 0) {
            return false;
        }

        int second_idx = 0;

        for (int i = 1; i < len; i++) {
            if (!isSubstring(s1.substring(0, i), s2)) {
                second_idx = i - 1;
                break;
            }
        }

        if (isSubstring(s1.substring(second_idx, len), s2))
            return true;

        return false;
    }

}
