public class Card {
    private Rank rank;
    private Suit suit;
    public Card(Rank rank, Suit suit) {
        if (rank != null && suit != null) {
            this.rank = rank;
            this.suit = suit;
        } else {
            System.out.println("Warning: Rank and Suit cannot be null!");
        }
    }

    public Rank getRank() {
        return this.rank;
    }

    public void setRank(Rank rank) {
        if (rank != null) {
            this.rank = rank;
        }
    }

    public Suit getSuit() {
        return this.suit;
    }

    public void setSuit(Suit suit) {
        if (suit != null) {
            this.suit = suit;
        }
    }
}