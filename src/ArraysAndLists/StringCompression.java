package ArraysAndLists;

public class StringCompression {

    public String solutionA (String str) {
        // Solution A - inefficient in time O(p + k^2) where p is original string size
        // and k is the number of character sequences
        // Also - Does not account for when the compressed string would be larger than the original string

        String return_str = "";

        int count = 1;
        char last = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                return_str += last + "" + count;
                last = str.charAt(i);
                count = 1;
            }
        }

        return return_str + last + count;
    }

    int countCompression (String str) {
        // used for solution B and solution C

        if (str == null || str.isEmpty()) return 0;
        char last = str.charAt(0);
        int size = 0;
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                last = str.charAt(i);
                size += 1 + String.valueOf(count).length();
                count = 1;
            }
        }

        size =+ 1 + String.valueOf(count).length();
        return size;
    }

    public String solutionB (String str) {
        // This solution uses a StringBuffer
        // The logic is applied similar to ConvertSpaces

        int size = countCompression(str);
        if (size >= str.length()) {
            return str;
        }

        StringBuffer myStr = new StringBuffer();
        char last = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                myStr.append(last);
                myStr.append(count);
                last = str.charAt(i);
                count = 1;
            }
        }

        myStr.append(last);
        myStr.append(count);
        return myStr.toString();
    }

    int setChar(char[] array, char c, int index, int count) {
        // Used for solutionC
        array[index] = c;
        index++;

        char[] cnt = String.valueOf(count).toCharArray();

        for (char x : cnt) {
            array[index] = x;
            index++;
        }

        return index;
    }

    public String solutionC (String str) {
        // Efficient solution without using StringBuffer

        int size = countCompression(str);
        if (size >= str.length()) {
            return str;
        }

        char[] chars = new char[size];
        char last = str.charAt(0);
        int index = 0;
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                index = setChar(chars, last, index, count);
                last = str.charAt(i);
                count = 1;
            }
        }

        index = setChar(chars, last, index, count);
        return new String(chars);
    }

}
