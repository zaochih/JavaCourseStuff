package Card;

public class RoleTest {
    public static void main(String[] args) {
        Role r1 = new Role("张三", 100, '男');
        Role r2 = new Role("韩梅梅", 100, '女');

        while (r1.getCredit() <2 && r2.getCredit() <2) {
            r1.attack(r2);
            if (r2.getBlood() <= 0 || r1.getCredit() == 2) {
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() <= 0) {
                break;
            }
        }
        // 说来课上其实很多攻击逻辑是写在这里的……不过我个人认为如果能直接体现在 Role.java 的 attack() 方法里就没必要在两个地方分别拉两大坨。
        System.out.println(((r1.getCredit() == 2) ? (r1.getName()) : (r2.getName())) + "赢了！");
    }
}
