package Recursion;

public class AnagramSort {

    // Sort an array of strings so anagrams are next to each other
    // Assume a stable sort

    boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] ascii_chars = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            ascii_chars[s1.charAt(i)]++;
            ascii_chars[s2.charAt(i)]--;
        }

        for (int i = 0; i < ascii_chars.length; i++) {
            if (ascii_chars[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
