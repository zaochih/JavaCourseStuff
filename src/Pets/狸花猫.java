package Pets;

public class 狸花猫 extends Cat {
    @Override
    public void eat() {
        System.out.printf("一只叫做%s的，%d岁的狸花猫，正在吃鱼", this.name, this.age);
    }
}
