package recursion;

import java.util.Arrays;

public class ReverseString {

    public static void swap(StringBuilder str, int low, int high) {

        char temp = str.charAt(low);

        str.setCharAt(low, str.charAt(high));

        str.setCharAt(high, temp);

    }

    public static void swap(int[] arr, int low, int high) {

        int temp = arr[low];

        arr[low] = arr[high];

        arr[high] = temp;

    }

    public static void reverse(StringBuilder str, int low, int high) {

        if (low == high) return;

        swap(str, low, high);

        reverse(str, low + 1, high - 1);

    }

    public static boolean isPalindrome(StringBuilder str, int low, int high) {

        if (low == high) return true;

        if (str.charAt(low) != str.charAt(high)) return false;

        return isPalindrome(str, low + 1, high - 1);

    }


    public static void bubbleSort(int[] arr, int n) {

        if (n == 0 || n == 1) return;

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) swap(arr, i, i + 1);

        }

        bubbleSort(arr, n - 1);

    }

    public static void selectionSort(int[] arr, int n) {

        if (n == 0 || n == 1) return;

        int max = 0;

        for (int i = 0; i < n; i++) {

            if (arr[max] < arr[i]) max = i;

        }
        swap(arr, max, n - 1);

        selectionSort(arr, n - 1);

    }

    public static void insertionSort(int[] arr, int i) {

        if (i == arr.length) return;

        int item = arr[i];

        int j = i - 1;

        while (j >= 0 && item < arr[j]) {

            arr[j + 1] = arr[j];

            j--;

        }

        arr[j + 1] = item;

        insertionSort(arr, i + 1);

    }

    public static int power(int a, int b) {

        if (b == 0) return 1;

        int val = power(a, b / 2);

        if (b % 2 == 0) {

            return val * val;

        } else {

            return a * val * val;

        }


    }

    public static void merge(int[] arr, int s, int e) {

        int mid = s + (e - s) / 2;

        int len1 = mid - s + 1;

        int len2 = e - mid;

        int[] left = new int[len1];

        int[] right = new int[len2];

        int index = s;

        for (int i = 0; i < len1; i++) {

            left[i] = arr[index++];

        }

        for (int i = 0; i < len2; i++) {

            right[i] = arr[index++];

        }

        index = s;

        int i = 0, j = 0;

        while (i < left.length && j < right.length) {

            if (left[i] < right[j]) arr[index++] = left[i++];

            else arr[index++] = right[j++];
        }

        while (i < left.length) {

            arr[index++] = left[i++];

        }

        while (j < right.length) {

            arr[index++] = right[j++];

        }

    }

    public static void mergeSort(int[] arr, int s, int e) {

        if (s >= e) return;
        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, e);

    }

    public static int partition(int[] arr, int s, int e) {

        int pivot = arr[s];

        int count = 0;

        for (int i = s + 1; i <= e; i++) {

            if (arr[i] <= pivot) count++;

        }

        int pivotIndex = s + count;

        swap(arr, s, pivotIndex);

        while (s < pivotIndex && e > pivotIndex) {

            while (arr[s] <= pivot) s++;

            while (arr[e] > pivot) e--;

            if (s < pivotIndex && e > pivotIndex) swap(arr, s, e);

        }

        return pivotIndex;

    }

    public static void quickSort(int[] arr, int s, int e) {

        if (s >= e) return;

        int p = partition(arr, s, e);

        quickSort(arr, s, p - 1);

        quickSort(arr, p + 1, e);

    }


    public static void main(String[] args) {

        StringBuilder obj = new StringBuilder("122");

        int[] arr = new int[]{1, 3, 2, 4, 6, 5, 2};

        boolean ans = isPalindrome(obj, 0, obj.length() - 1);

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }

}
