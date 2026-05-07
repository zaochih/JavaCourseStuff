static void main() {
  Scanner sc = new Scanner(System.in);
  IO.print("给个号：");
  while (sc.hasNext()) {
    String s = sc.next();
    IO.println((isQNum(s)) ? "太对了\n" : "不对不对\n");
    IO.print("再给个号：");
  }
}

public static boolean isQNum(String num) {
  if (num == null || num.isEmpty()) { return false; }
  if (num.startsWith("0")) { return false; }
  try {
    Integer.parseInt(num);
  } catch (NumberFormatException e) { return false; }
  return num.length() <= 10 && num.length() >= 5; // 我记得最大应该是 10 位
}

public static boolean isPhoneNum(String num) {
  if (num == null || num.isEmpty()) { return false; }
  if (num.startsWith("0")) { return false; }
  try {
    Integer.parseInt(num);
  } catch (NumberFormatException e) { return false; }
  if (num.length() != 11) { return false; }
    return num.startsWith("13")
            || num.startsWith("15")
            || num.startsWith("16")
            || num.startsWith("17")
            || num.startsWith("18")
            || num.startsWith("19");
}