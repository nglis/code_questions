package SortAndSearch;

public class RotatedArraySearch {

    // Find an element in a rotated array (that was initially sorted)
    // Ex. { 15, 20, 30, 40, 5, 10 }

    public int search(int[] a, int left, int right, int x) {
        int mid = (left + right) / 2;
        if (a[mid] == x) {
            return mid;
        }

        if (right < left) {
            return -1;
        }

        if (a[left] < a[mid]) {
            if (x >= a[left] && x <= a[mid]) {
                return search(a, left, mid - 1, x);
            } else {
                return search(a, mid + 1, right, x);
            }
        } else if (a[mid] < a[left]) {
            if (x >= a[mid] && x <= a[right]) {
                return search(a, mid + 1, right, x);
            } else {
                return search(a, left, mid - 1, x);
            }
        } else if (a[left] == a[mid]){
            if (a[mid] != a[right]) {
                search(a, mid + 1, right, x);
            } else {
                int result = search(a, left, mid - 1, x);
                if (result == -1) {
                    result = search(a, mid + 1, right, x);
                }
                return result;
            }
        }

        return -1;
    }

}
