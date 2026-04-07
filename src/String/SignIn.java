package String;

import java.util.Scanner;

public class SignIn {
    static void main() {
        Account a1 = new Account("HolyShit", "thatSucksMan");
        Account a2 = new Account("JohnDoe", "password123");
        Account a3 = new Account("JoeBiden", "p@ssw0rd");
        Account a4 = new Account("Alice", "qwerty");
        Account a5 = new Account("Bob", "letmein");
        Account a6 = new Account("John", "asdfg");
        Account a7 = new Account("Brian", "zxcvb");
        Account a8 = new Account("Peter", "p3ter");
        Account a9 = new Account("Lois", "l01S");
        Account a10 = new Account("Craig", "Cr4ag");

        Account[] aarr = new Account[10];
        aarr[0] = a1;
        aarr[1] = a2;
        aarr[2] = a3;
        aarr[3] = a4;
        aarr[4] = a5;
        aarr[5] = a6;
        aarr[6] = a7;
        aarr[7] = a8;
        aarr[8] = a9;
        aarr[9] = a10;

        String captcha = genRanStr(4);

        Scanner sc = new Scanner(System.in);

        for (int i = 0; true; i++) {
            IO.print("Enter username: ");
            String inputUN = sc.nextLine();
            IO.print("Enter password: ");
            String inputPWD = sc.nextLine();
            IO.println("Captcha: " + captcha);
            String inputCAPTCHA = sc.nextLine();

            if (!inputCAPTCHA.equalsIgnoreCase(captcha)) {
                if ((2 - i) != 0){
                    IO.println("Invalid CAPTCHA! You have " + (2 - i) + " retries remaining.");
                    continue;
                } else { IO.println("Illegal attempts."); break; }
            }

            if (contains(aarr, inputUN) && inputPWD.equals(getPassword(aarr, inputUN))) {
                IO.println("Authenticated successfully!");
                break;
            } else {
                if ((2 - i) != 0){
                    IO.println("Invalid username or password! You have " + (2 - i) + " chances remaining.");
                } else { IO.println("Illegal attempts."); break; }
            }
        }


    }

    public static String genRanStr(int len) {
        if (len <= 0) {
            throw new IllegalArgumentException("Length must be a positive integer.");
        }

        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder sb = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            sb.append(CHARACTERS.charAt((int) (Math.random() * CHARACTERS.length())));
        }

        return sb.toString();
    }

    public static boolean contains(Account[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getUsername().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String getPassword(Account[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] != null) && (arr[i].getUsername().equals(str))) {
                return arr[i].getPassword();
            }
        }
        return null;
    }
}
