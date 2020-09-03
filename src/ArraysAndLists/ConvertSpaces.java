package ArraysAndLists;

public class ConvertSpaces {

    public String convertSpaces(String str) {
        int length = str.length();
        int spaceCount = 0, newLength;

        char[] strAsChars = str.toCharArray();

        // First we count through the space
        for (int i = 0; i < length; i++) {
            if(strAsChars[i] == ' ')
                spaceCount++;
        }

        // Next we define the new array length and endpoint
        newLength = length + spaceCount * 2;
        strAsChars[newLength] = '\0';

        // Finally, we iterate through the array in reverse, and write the letters and altered spaces to the array
        // in the new length positions
        for (int i = length - 1; i >= 0; i--) {
            if (strAsChars[i] == ' ') {
                strAsChars[newLength - 1] = '0';
                strAsChars[newLength - 2] = '2';
                strAsChars[newLength - 3] = '%';
                newLength -= 3;
            } else {
                strAsChars[newLength] = strAsChars[i];
                newLength -=1;
            }
        }

        return new String(strAsChars);
    }
}
