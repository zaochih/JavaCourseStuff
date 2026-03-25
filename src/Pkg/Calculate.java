package Pkg;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num == 0) break;
            sum += num;
        }
        IO.println(sum);
    }
}
