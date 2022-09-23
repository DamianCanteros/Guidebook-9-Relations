
package exercise_3.object;

/**
 *
 * @author Damian
 */
public class Card {
    
    private Integer number;
    private String suit;

    public Card() {
    }

    public Card(Integer number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "\n" +
               number + " of " + suit;
    }
}
