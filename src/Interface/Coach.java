package Interface;

public class Coach extends Person {
    public Coach() {}

    public Coach(String name, int age) {
        super(name, age);
    }

    public void teach() {
        IO.println("Coach " + this.getName() + " is teaching");
    }
}
