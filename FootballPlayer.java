public class FootballPlayer extends Player {

    public FootballPlayer(String name, int jerseyNumber) {
        super(name, jerseyNumber);
    }

    public void playGame() {
        this.minutesPlayed += 90;
    }
}