package Interface;

public class TableTennisPlayer extends Player implements CanSpeakEnglish {
    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        IO.println("Table Tennis Player " + this.getName() + " is speaking English");
    }
}
