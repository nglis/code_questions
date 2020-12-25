package SortAndSearch;

public class FindString {

    // Find string in sorted array interspersed with empty string

    public int search(String[] a, String s, int left, int right) {
        if (right < left) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (a[mid].isEmpty()) {
            int l = mid - 1;
            int r = mid + 1;

            while(true) {
                if (l < left && r > right) {
                    return -1;
                }
                if (l >= left && !a[l].isEmpty()) {
                    mid = l;
                    break;
                }
                if (r <= right && !a[r].isEmpty()) {
                    mid = r;
                    break;
                }
                l--;
                r++;
            }
        }

        if (a[mid].equals(s)) {
            return mid;
        } else if (a[mid].compareTo(s) < 0) {
            search(a, s, mid + 1, right);
        } else {
            search(a, s, left, mid - 1);
        }

        return -1;
    }

    public int searchR(String[] arr, String s) {
        if (arr == null || s == null || s == "") {
            return -1;
        }

        return search(arr, s, 0, arr.length - 1);
    }
}
