package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ParenthesesPerms {

    // Get all possible close parentheses for n parentheses pairs (i.e. ())

    public void addParen(ArrayList<String> list, int leftRem, int rightRem, char[] str, int count) {
        if (leftRem < 0 || rightRem < leftRem) return;

        if (leftRem == 0 && rightRem == 0) {
            String s = String.copyValueOf(str);
            list.add(s);
        } else {
            if (leftRem > 0) {
                str[count] = '(';
                addParen(list, leftRem - 1, rightRem, str, count + 1);
            }

            if (rightRem > leftRem) {
                str[count] = ')';
                addParen(list, leftRem, rightRem - 1, str, count + 1);
            }
        }
    }

    public ArrayList<String> generateParens(int count) {
        char[] str = new char[count * 2];
        ArrayList<String> list = new ArrayList<String>();
        addParen(list, count, count, str, 0);
        return list;
    }


    // Alternative solution

    public Set<String> getPerms(int n) {
        Set<String> set = new HashSet<String>();
        if (n == 0) {
            set.add("");
        } else {
            Set<String> perms = getPerms(n - 1);
            for (String perm : perms) {
                for (int i = 0; i < perm.length(); i++) {
                    if (perm.charAt(i) == '(') {
                        String newPerm = insertParentheses(perm, i);
                        set.add(newPerm);
                    }
                }

                set.add("()" + perm);
            }
        }

        return set;
    }

    public String insertParentheses(String str, int leftIndex) {
        String start = str.substring(0, leftIndex + 1);
        String end = str.substring(leftIndex + 1);
        return start + "()" + end;
    }

}
