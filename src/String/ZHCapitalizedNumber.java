package String;

import java.util.Scanner;
import java.util.StringJoiner;

public class ZHCapitalizedNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            IO.print("请输入一个不多于7位的非负整数：");
            try {
                int num = sc.nextInt();
                if (num < 0 || String.valueOf(num).length() > 7) {
                    IO.println("请输入一个非负整数，且位数不超过7位。\n");
                    continue;
                }
                IO.println(toCapitalize(num) + "\n");
            } catch (Exception e) {
                if (sc.hasNextLine()) { sc.nextLine(); } else { return; }
                IO.println("数字无效。\n");
            }
        }
    }

    public static String toCapitalize(int num) {
        StringBuilder sb = new StringBuilder();
//        StringJoiner sj = new StringJoiner(", ");
        String toStringlized = "%07d".formatted(num);
        for (int i = 6; i >= 0; i--) {
            if (i > 4) {
                sb.append(
                        capDict(toStringlized.charAt(6 - i) - '0')).append(
                                unitDict(i - 4));
            } else {
                sb.append(
                        capDict(toStringlized.charAt(6 - i) - '0')).append(
                                unitDict(i));
            }
        }
        return sb.append("元").toString();
//        return sj.add(sb.toString()).add("元").toString();
    }

    public static String capDict(int num) {
        String[] dict = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return dict[num];
    }

    public static String unitDict(int position) {
        String[] units = {"", "拾", "佰", "仟", "万"};
        return units[position];
    }
}
