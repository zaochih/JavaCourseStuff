import java.util.Objects;
import java.util.Scanner;

public class Main {
  static class Account {
    static double balance = 0;
    static public double getBalance() {
      return balance;
    }
    public void setBalance(int bal, int opration) {
      if (opration == 1) {
        balance += bal;
      } else if (opration == 2) {
        balance -= bal;
      }
    }
  }
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Account account = new Account();
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      if (line.trim().isEmpty()) {
        break;
      }
      String[] s = line.split(" ");
      System.out.println(s[2] + s[3]);
      if (Objects.equals(s[2], "+")) {
        account.setBalance(Integer.parseInt(s[3]), 1);
      } else if (Objects.equals(s[2], "-")) {
        account.setBalance(Integer.parseInt(s[3]), 2);
      }
    }
    System.out.println("联名银行卡余额为" + String.format("%.2f", Account.getBalance()) + "元");
  }
}