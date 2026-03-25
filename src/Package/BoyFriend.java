package Package;

public class BoyFriend {
    public String name;
    private int age = -1;

    public void setAge (int n) {
        if (n < 18) {
            IO.println("I don't think it's legal.");
        } else if (n > 60) {
            IO.println("I don't think money can take over age gap.");
        } else {
            this.age = n;
        }
    }

    public void getAge () {
        if (age != -1) {
            IO.println(age);
        } else {
            IO.println("No age available. Candidate inappropriate.");
        }
    }
}
