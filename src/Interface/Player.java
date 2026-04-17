package Interface;

public class Player extends Person {
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public void learn() {
        IO.println("Player " + this.getName() + " is learning");
    }
}
