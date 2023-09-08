package recursion;

public class SortedArray {

    public static boolean isSorted(int[] arr, int i, int size) {

        if (size == 0 || size == 1 || i == size) return true;

        if (arr[i - 1] > arr[i]) return false;

        else return isSorted(arr, i + 1, size);

    }
    public static int sum(int[] arr, int index) {

        if (index == arr.length) return 0;

        return arr[index] + sum(arr, index + 1);

    }
    public static boolean linearSearch(int[] arr, int item, int index) {

        if (index == arr.length) return false;

        if (arr[index] == item) return true;

        else return linearSearch(arr, item, index + 1);

    }
    public static boolean binarySearch(int[] arr, int item, int start, int end) {

        if (start > end) return false;

        int mid = start + (end - start) / 2;

        if (arr[mid] == item) return true;

        else if (arr[mid] > item) return binarySearch(arr, item, start, mid - 1);

        else return binarySearch(arr, item, mid + 1, end);
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 6, 7};

        boolean ans = binarySearch(arr, 3, 0,arr.length-1);

        int res = sum(arr, 0);

        System.err.println(ans);

    }

}
