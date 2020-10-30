public class Uppgift_13_6 {
    public static void main(String[] args) {

        Card c1 = getInstance(Card.SPADES, Card.QUEEN);

        Card.print(c1); // utskriftsmetod skapad i klassen Card


        Card c2 = getInstance(Card.CLUBS, 7);

    }

    public static Card getInstance(int spades, int queen) {
        Card c1 = new Card();
        // Färg
        c1.suit = spades;
        // Valör
        c1.rank = queen;
        return c1;
    }


}
