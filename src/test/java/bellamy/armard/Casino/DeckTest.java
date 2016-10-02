package bellamy.armard.Casino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 10/2/16.
 */
public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void init(){
        deck = new Deck();
        card = new Card(3, Card.CLUBS);
    }

    @Test
    public void numberOfCardsLeftTest(){
        deck.dealACard();
        int actual = deck.numberOfCardsLeft();
        int expected = 51;
        Assert.assertEquals("Should return 51", expected, actual);
    }

    @Test
    public void dealACardTest(){
        deck.dealACard();
        int actual = deck.numberOfCardsLeft();
        int expected = 51;
        Assert.assertEquals("Should return 51", expected,actual);
    }

    @Test
    public void shuffleTest(){
        deck.shuffle();
        String expected = "3 of CLUBS";
        String actual = card.toString();
        Assert.assertEquals("Should return a card", expected, actual);
    }
}
