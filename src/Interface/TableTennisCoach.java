package Interface;

public class TableTennisCoach extends Coach implements CanSpeakEnglish{
    public TableTennisCoach() {}

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        IO.println("Table Tennis Coach " + this.getName() + " is speaking English");
    }
}
