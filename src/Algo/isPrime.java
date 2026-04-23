package Algo;

import java.util.Scanner;

public class isPrime {
    static void main() {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            long start = System.nanoTime();
            int n = sc.nextInt();
            System.out.printf("%d " + (prime(n)? "is " : "is not ") + "a prime.\n", Integer.parseInt(String.valueOf(n)));
            long end = System.nanoTime();
            System.out.printf("%d " + (end - start)/1000000.0 + "\n", n);
        }

    }
    public static boolean prime(int n) {
        if (n == 2) return true;
        if (n < 2 || n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
