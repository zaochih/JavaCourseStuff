package Pets;

public class 波斯猫 extends Cat {
    @Override
    public void eat() {
        System.out.printf("一只叫做%s的，%d岁的波斯猫，正在吃小饼干", this.name, this.age);
    }
}
