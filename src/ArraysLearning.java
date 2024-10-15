import java.util.Arrays;

public class ArraysLearning {

    public static void main(String[] args) {
//        System.out.println(sumAndAvg());
//        System.out.println(noOfOccurences());
//        findMinAndMax();
//        System.out.println(isSorted());
//        reverseArray();
//        System.out.println(isPalindrome());
//        mergeTwoSortedArrays();
    }

    public static double sumAndAvg() {
        int[] arr = {191993, 21293, 4129, 9423, 62677};
        int sz = arr.length;

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return (double) sum / sz;

    }

    public static int noOfOccurences() {
        int[] arr = {19, 19, 27, 21, 14};
        int x = 19;
        int count = 0;
        for (int i : arr) {
            if (i == x) count++;
        }

        return count;

    }

    public static void findMinAndMax() {
        int[] arr = {191993, 21293, 4129, 9423, 62677};
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum element is " + min + " Maximum element is " + max);

    }

    public static boolean isSorted() {
        int[] arr = {10, 23, 45, 91, 108};
        int sz = arr.length;
        for (int i = 1; i < sz; i++) {
            if (arr[i - 1] > arr[i]) return false;
        }
        return true;
    }

    public static void reverseArray() {
        int[] arr = {10, 23, 45, 91, 108};
        int sz = arr.length - 1;
        int i = 0;
        while (i <= sz) {
            int temp = arr[i];
            arr[i] = arr[sz];
            arr[sz] = temp;
            i++;
            sz--;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static boolean isPalindrome() {
        int[] arr = {10, 23, 45, 23, 10};
        int sz = arr.length - 1;
        int i = 0;
        while (i <= sz) {
            if (arr[i++] != arr[sz--]) return false;
        }
        return true;
    }

    public static void mergeTwoSortedArrays() {
        int[] arr1 = {10, 23, 45, 91, 108};
        int[] arr2 = {2, 8, 19, 48, 107, 911, 1080};
        int i = arr1.length - 1, j = 0, m = arr2.length;
        while (i >= 0 && j < m && arr1[i] >= arr2[j]) {
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int elem : arr1) {
            System.out.print(elem + " ");
        }
        System.out.println();
        for (int elem : arr2) {
            System.out.print(elem + " ");
        }

    }

}



