package ArraysAndLists;

/* Check if string has all unique characters */

import java.util.HashMap;

public class UniqueCharacters {

    public Boolean solution(String str) {
        // Assuming ASCII
        // O(n) time, O(1) space
        if (str.length() > 256) return false;

        boolean[] char_list = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if (char_list[val])
                return false;
            else
                char_list[val] = true;
        }

        return true;
    }

    public Boolean solution2(String str) {
        // Need to revisit this
        int checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0)
                return false;
            checker |= (1 << val);
        }
        return true;
    }

    public Boolean bruteForce(String str) {
        // O(n^2) time, O(1) space
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public Boolean mapMethod(String str) {
        // Similar to how a lookup array would work
        HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();

        for (Character c : str.toCharArray()) {
            if (map.get(c) != null)
                return false;
            else
                map.put(c, true);
        }
        return true;
    }

}
