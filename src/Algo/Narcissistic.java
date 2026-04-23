package Algo;

import java.util.Scanner;

public class Narcissistic {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IO.println(n + (isNarcissistic(n)? " is " : " is not ") + "a narcissistic number.");
    }
    public static boolean isNarcissistic(int n) {
        if (String.valueOf(n).length() != 3) return false; // 理论上这里也不需要判断的，而且这样写实在是太丑陋了……
        int sum = 0, input = n;
        while (n != 0) {
            sum += (int) Math.pow(n % 10, 3);
            // 我个人是认为这里加不加 int 都无所谓的，因为 technically 它不可能是 double。Adding it to make the inspector happy.
            n /= 10;
        }
        IO.println(sum);
        IO.println((sum == input));
        return sum == input;
    }
}
