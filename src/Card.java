public class Card {

    // Clubs = klöver
    // Diamonds = ruter
    // Hearts - hjärter
    // Spades = spader


    // Konstanter / Klassvariabler
    public static final int CLUBS = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int SPADES = 3;

    // Instansvariabler / Egenskaper // Attribut

    public int suit; // Färg - använd konstanterna
    public int rank; // Valör - heltal mellan 1 och 13

    public static final String[] RANKS = {null, "1", "2", "3", "4", "5", "6", "7", "8", "9",
                                    "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};


    // Flera konstanter
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    public static final String[] SUITS_UNICODE = {"\u2667", "\u2662", "\u2661", "\u2664"};

    public static void print(Card c) {
        System.out.println(c); // Card@5f184fc6
        System.out.println(c.suit + " " + c.rank); // 3 12
        System.out.println(Card.RANKS[c.rank] + " of " + Card.SUITS[c.suit]); // Queen of Spades
        System.out.println(Card.RANKS[c.rank] + " of " + Card.SUITS_UNICODE[c.suit]); // Queen of ♤


    }
}
