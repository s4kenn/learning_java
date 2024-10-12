import java.util.Scanner;

import static java.lang.Math.floor;

public class Main {
    public static void main(String[] args) {
//        WhileLoop w = new WhileLoop();
//        w.function();
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        multiplication(n);
//        System.out.println(sumOddTillN(31));
//        System.out.println(factorial(5));
//        System.out.println(sumOfDigits(129621));
//        System.out.println(LCM(12, 19));
//        System.out.println(GCD(12, 19));
//        System.out.println(isPrime(4));
//        fibonacci(9);
//        System.out.println(isPalindrome(123454321));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 4 - i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println(isArmstrong(153));


    }

    public static void multiplication(int n) {

        for (int i = 2; i < 11; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }

    }

    public static int sumOddTillN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }


    public static int sumOfDigits(int n) {
        int sumDigits = 0;
        while (n > 0) {
            sumDigits += n % 10;
            n = n / 10;
        }
        return sumDigits;
    }

    public static int LCM(int a, int b) {

        int start = Math.max(a, b);
        for (int i = start; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int GCD(int a, int b) {

        return (a * b) / LCM(a, b);

    }

    public static boolean isPrime(int n) {

        if (n == 0 || n == 1) return false;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
            if (count > 2) return false;
        }

        return count == 2;

    }

    public static void fibonacci(int n) {

        int a = 0;
        int b = 1;
        System.out.print(b + " ");
        int c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

    public static int helper(int n) {
        int res = 0;
        while (n > 0) {
            res = res * 10 + n % 10;
            n = n / 10;
        }
        return res;
    }

    public static boolean isPalindrome(int dig) {
        int reversedDig = helper(dig);
        return dig == reversedDig;
    }

    public static int helperFun(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n = n / 10;
        }
        return c;
    }

    public static boolean isArmstrong(int n) {
        int noOfDigs = helperFun(n);
        double res = 0;
        int temp = n;
        while (temp > 0) {
            int lastD = temp % 10;
            temp = temp / 10;
            res = res + Math.pow(lastD, noOfDigs);
        }
        res = Math.floor(res);
        return res == n;
    }

}