package bellamy.armard.Casino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 10/2/16.
 */
public class HandTest {

    Hand hand;
    Card card;
    Card card2;

    @Before
    public void init(){
        hand = new Hand();
        card = new Card(2, Card.HEARTS);
        card2 = new Card(4, Card.CLUBS);
    }

    @Test
    public void clearHandTest(){
        hand.addACard(card);
        hand.clearHand();
        int actual = hand.getSizeofHand();
        int expected = 0;
        Assert.assertEquals("Should return 0.", expected, actual);
    }

    @Test
    public void removeACardTest(){
        hand.addACard(card);
        hand.addACard(new Card(2, Card.DIAMONDS));
        hand.removeACard(card);
        int actual = hand.getSizeofHand();
        int expected = 1;
        Assert.assertEquals("Hand size should be 1", expected, actual);
    }

    @Test
    public void removeCardAtCertainPositionTest(){
        hand.addACard(card);
        hand.addACard(new Card(4, Card.CLUBS));
        hand.addACard(new Card(3, Card.CLUBS));
        Card actual = hand.removeACardAtCertainPosition(1);
        Card expected = card2;
        Assert.assertEquals("Should return 4 of CLUBS", expected, actual);

    }

}
