package Recursion;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class AnagramSort {

    // Sort an array of strings so anagrams are next to each other

    void sort(String[] arr) {
        Hashtable<String, LinkedList<String>> hash = new Hashtable<>();

        for (String s : arr) {
            String key = sortChars(s);
            if (!hash.containsKey(key)) {
                hash.put(key, new LinkedList<String>());
            }

            LinkedList<String> anagrams = hash.get(key);
            anagrams.push(s);
        }

        int index = 0;
        for (String key : hash.keySet()) {
            LinkedList<String> list = hash.get(key);
            for (String t :list) {
                arr[index] = t;
                index++;
            }
        }

    }

    String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    int compare(String s1, String s2) {
        return sortChars(s1).compareTo(sortChars(s2));
    }

    void anagramSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (isAnagram(arr[i], arr[i + 1]))
                continue;

            for (int j = i + 2; j < arr.length; i++) {
                if (isAnagram(arr[i], arr[j])) {
                    String temp = arr[j];
                    arr[j] = arr[i + 1];
                    arr[i + 1] = temp;
                    break;
                }
            }
        }
    }

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
