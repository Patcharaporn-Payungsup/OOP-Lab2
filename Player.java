public class Player {
    protected String name;
    protected int jerseyNumber;
    protected int minutesPlayed;

    public Player(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.minutesPlayed = 0;
    }

    public void print() {
        System.out.println(this.name + ":" + this.jerseyNumber);
    }

    public int getMinutesPlayed() {
        return this.minutesPlayed;
    }
}