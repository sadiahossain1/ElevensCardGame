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
        System.out.println(card1.rank());
        System.out.println(card2.suit());
        System.out.println(card3.pointValue());
        System.out.println(card1.matches(card2));
        System.out.println(card1.matches(card3));
    }
}
