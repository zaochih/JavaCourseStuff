package Interface;

public class Test {
    static void main() {
        TableTennisPlayer tableTennisPlayer = new TableTennisPlayer("Tom", 20);
        tableTennisPlayer.speak();
        tableTennisPlayer.learn();
        IO.println(tableTennisPlayer.getName() + " " + tableTennisPlayer.getAge());

        BasketballPlayer basketballPlayer = new BasketballPlayer("Jack", 20);
        basketballPlayer.learn();
        IO.println(basketballPlayer.getName() + " " + basketballPlayer.getAge());

        TableTennisCoach tableTennisCoach = new TableTennisCoach("Tommy", 40);
        tableTennisCoach.speak();
        tableTennisCoach.teach();
        IO.println(tableTennisCoach.getName() + " " + tableTennisCoach.getAge());

        BasketballCoach basketballCoach = new BasketballCoach("Jacky", 40);
        basketballCoach.teach();
        IO.println(basketballCoach.getName() + " " + basketballCoach.getAge());
    }
}
