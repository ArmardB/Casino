package bellamy.armard.Casino;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by armardbellamy on 10/2/16.
 */
public class Hand {

    private ArrayList<Card> hand;


    public Hand(){
        hand = new ArrayList<Card>();
    }

    public void clearHand(){
        hand.clear();
    }

    public void addACard(Card card){
        if (card == null){
            throw new NullPointerException("Sorry can't add a null card to your hand");
        }
        hand.add(card);
    }

    public int getSizeofHand(){
        return hand.size();
    }

    public void removeACard(Card card){
        hand.remove(card);
    }

    public Card removeACardAtCertainPosition(int cardPosition){
        if (cardPosition < 0){
            throw new IllegalArgumentException("Card position " + cardPosition + " is out of range");
        }
        return hand.get(cardPosition);

    }

    public void sortCardsBySuit(){
        ArrayList<Card> newSortedHand = new ArrayList<Card>();
        while (hand.size() > 0){
            int initPosition = 0;
            Card card = hand.get(0);
            for (int i = 0; i < hand.size(); i++){
                Card card1 = hand.get(i);
                if (card1.getValue() == card.getValue() && (card1.getSuit()  < card.getSuit()) ){
                    initPosition = i;
                    card = card1;
                }
            }
            hand.remove(initPosition);
            newSortedHand.add(card);
        }

    }
}
