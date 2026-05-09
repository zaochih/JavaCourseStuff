package utilDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class somePracOne {
    static void main() {
        IO.print("Give me a number: ");
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            String nextInt = sc.nextLine();
            int nxtInt;
            try {
                nxtInt = Integer.parseInt(nextInt);
            } catch (NumberFormatException e) {
                IO.println("That's not a valid number. Please try again.");
                continue;
            }
            if (nxtInt >= 1 && nxtInt <= 100) {
                list.add(Integer.parseInt(nextInt));
                if (sum(list) > 200) {
                    IO.println("200 exceeded.");
                    System.out.printf("The total is %d now.", sum(list));
                    break;
                }
            } else {
                IO.println("That's not a valid number. Please try again.");
            }
            IO.print("Give me another one: ");
        }
    }
    static int sum (List<Integer> list) {
        int sum = 0;
        for (Integer item : list) {
            sum += item;
        }
        return sum;
    }
}
