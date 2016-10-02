package bellamy.armard.Casino;

/**
 * Created by armardbellamy on 10/2/16.
 */
public class Deck {

    private Card[] deck;
    private int numberOfCardsUsed;


    public Deck(){
        deck = new Card[52];
        int cardCount = 0;
        for (int suit = 0; suit <= 3; suit++){
            for (int value = 1; value <= 13; value++){
                deck[cardCount] = new Card(value, suit);
                cardCount++;
            }
        }
        numberOfCardsUsed = 0;
    }

    public int numberOfCardsLeft(){
        return deck.length - numberOfCardsUsed;
    }

    // Removes the next card from the deck and returns it
    public Card dealACard(){
        if (numberOfCardsUsed == deck.length){
            throw new IllegalStateException("There are no cards left in the deck");
        }
        numberOfCardsUsed++;
        return deck[numberOfCardsUsed - 1];
    }

    public void shuffle(){
        for (int i = deck.length - 1; i > 0; i--){
            int randomNumber = (int)((Math.random() * (i + 1)));
            Card temporary = deck[i];
            deck[i] = deck[randomNumber];
            deck[randomNumber] = temporary;
        }
        numberOfCardsUsed = 0;
    }





}
