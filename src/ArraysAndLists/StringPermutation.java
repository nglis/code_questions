package ArraysAndLists;

public class StringPermutation {

    // Main solution (cleaner code)
    public Boolean solution(String s, String t) {
        if (s.length() != t.length())
            return false;

        return sort(s).equals(sort(t));
    }

    public String sort(String s) {
        char[] chars = s.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }

    // Secondary solution (more efficient)
    public Boolean permutation(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] letterCount = new int[256];

        char[] s_chars = s.toCharArray();
        for (char c : s_chars)
            letterCount[c]++;

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(--letterCount[c] < 0)
                return false;
        }

        return true;
    }

    // Alternative
    public Boolean charCounting(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] letters = new int[256];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)]++;
            letters[t.charAt(i)]--;
        }

        for (int count : letters) {
            if (count < 0)
                return false;
        }

        return true;
    }

}
