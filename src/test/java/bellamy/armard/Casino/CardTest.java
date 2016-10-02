package bellamy.armard.Casino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 10/2/16.
 */
public class CardTest {

    Card card;

    @Before
    public void init(){
        card = new Card(2, Card.HEARTS);
    }

    @Test
    public void getSuitAsStringTest(){
        String actual = card.getSuitAsString();
        String expected = "HEARTS";
        Assert.assertEquals("Should return HEARTS", expected, actual);
    }

    @Test
    public void getValueAsStringTest(){
        String actual = card.getValueAsString();
        String expected = "2";
        Assert.assertEquals("Should return 2", actual, expected);
    }

    @Test
    public void toStringTest(){
        String actual = card.toString();
        String expected = "2 of HEARTS";
        Assert.assertEquals("Should return 2 of HEARTS", expected, actual);
    }
}
