import java.util.Scanner;

public class MainNew {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        for (int i = 0; i < 5; i++) {
//            arr[i] = i + 1;
//        }
//        System.out.println("Elements insterted");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        newFunc();
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void newFunc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int sz = scanner.nextInt();
        int[] array = new int[sz];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < sz; i++) {
            int elem = scanner.nextInt();
            array[i] = elem;
        }
        System.out.print("Enter the element you want to search: ");
        int element = scanner.nextInt();
        int idx = linearSearch(array, element);
        if (idx == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + idx);
        }
    }

    public static int linearSearch(int[] array, int x) {
        int sz = array.length;
        for (int i = 0; i < sz; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
