package Card;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private int initBlood;
    private int credit;
    private char gender;
    private String appearance;

    String[] boyAppearance = {"英俊潇洒", "玉树临风", "风流倜傥", "气宇轩昂", "风度翩翩"};
    String[] girlAppearance = {"闭月羞花", "沉鱼落雁", "倾国倾城", "楚楚动人"};

    String[] attackDesc = {
        "一拳击中",
        "一脚踢向",
        "一掌拍向",
        "挥拳砸向",
        "飞身冲向"
        // 我个人认为在这里放字符串变量是很奇怪的拆分句子的方式，因此不采用 %s 的形式
    };

    String[] aftermath = {
        "，造成了 %d 点伤害，",
        "，打出了 %d 点伤害，",
        "，造成 %d 点伤害，",
        "，击中造成 %d 点伤害，",
        "，成功造成 %d 点伤害，"
    };

    String[] aftermathMissed = {
       "，但被躲开了",
       "，但被巧妙地躲过了"
    };

    public Role() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = Math.max(blood, 0);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(char gender) {
        if (gender == '男') {
            this.appearance = boyAppearance[new Random().nextInt(boyAppearance.length)];
        } else if (gender == '女') {
            this.appearance = girlAppearance[new Random().nextInt(girlAppearance.length)];
        }
    }

    public void show () {
        System.out.println("容貌" + this.appearance);
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.initBlood = blood;
        this.gender = gender;
        setAppearance(gender);
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void attack (Role role) {
        if (this.blood == 0) {
            System.out.println(this.name + " is dead and can't perform such action.");
            return;
        }
        Random rand = new Random();
        int hurt = rand.nextInt(20);
        role.setBlood(role.getBlood() - hurt);
        System.out.printf(this.appearance + "的" + this.name + attackDesc[new Random().nextInt(attackDesc.length)] + role.name);
                if (hurt > 0) {
                    System.out.printf(aftermath[new Random().nextInt(aftermath.length)], hurt);
                    System.out.print(role.getBlood() + " 点剩余\n");
                } else { System.out.println(aftermathMissed[new Random().nextInt(aftermathMissed.length)]); }
        if (role.getBlood() <= 0) {
            System.out.println(this.name + "杀死了"  + role.name);
            this.credit++;
            if (this.credit < 2 && role.credit < 2) { System.out.println("\n>>> 新轮回，血量已重置。"); }
            this.blood = this.initBlood;
            role.blood = role.initBlood;
        }
    }
}
