/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        Card card1 = new Card("Diamond", "idk", 2);
        Card card2 = new Card("Diamond", "idk", 2);
        Card card3 = new Card("Hearts", "idk", 6);
        card1.rank();
        card2.suit();
        card3.pointValue();
    }
}
