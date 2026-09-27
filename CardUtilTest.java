public class CardUtilTest {
    public static void main(String[] args) {
        Card topCard = new Card(Rank.ACE, Suit.SPADES);
        Card otherCard = new Card(Rank.KING, Suit.HEARTS);

        System.out.println("Highest Rank: " + CardUtil.HIGHEST_RANK);
        System.out.println("Highest Suit: " + CardUtil.HIGHEST_SUITE);

        System.out.println("Is topCard highest? " + CardUtil.isHighestCard(topCard));   // true
        System.out.println("Is otherCard highest? " + CardUtil.isHighestCard(otherCard)); // false
    }
}