public class BasketballPlayer extends Player {

    public BasketballPlayer(String name, int jerseyNumber) {
        super(name, jerseyNumber);
    }

    public void playGame() {
        this.minutesPlayed += 48;
    }

    public void changeJerseyNumber(int newNumber) {
        this.jerseyNumber = newNumber;
        System.out.println(this.name + " changes number to " + this.jerseyNumber);
    }
}