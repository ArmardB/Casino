package bellamy.armard.Casino;

import java.util.Scanner;

/**
 * Created by armardbellamy on 10/2/16.
 */
public class HighLow {

    public static void main(String[] args) {
        Display display = new Display();
        display.highLowWelcome();

        Scanner scanner = new Scanner(System.in);
        int gamesPlayed = 0;
        int sumOfScores = 0;

        double averageScore;
        boolean playAgain;

        do {
            int scoreThisGame;        // Score for one game.
            scoreThisGame = play();   // Play the game and get the score.
            sumOfScores += scoreThisGame;
            gamesPlayed++;
            System.out.print("Play again? ");
            playAgain = scanner.nextBoolean();
            if (playAgain == true){

            }
        } while (playAgain);

        averageScore = ((double)sumOfScores) / gamesPlayed;

        System.out.println();
        System.out.println("You played " + gamesPlayed + " games.");
        System.out.printf("Your average score was %1.3f.\n", averageScore);

    }


    private static int play() {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        Card currentCard;
        Card nextCard;
        int correctGuesses = 0;
        String guess;


        deck.shuffle();


        currentCard = deck.dealACard();
        System.out.println("The first card is the " + currentCard);

        while (true) {

            System.out.print("Will the next card be higher (H) or lower (L)?  ");
            guess = scanner.next().toUpperCase();

            nextCard = deck.dealACard();
            System.out.println("The next card is " + nextCard);



                if (nextCard.getValue() == currentCard.getValue()) {
                    System.out.println("The value is the same as the previous card.");
                    System.out.println("You lose on ties. The house always wins!!!  Sorry!");
                    break;  // End the game.
                } else if (nextCard.getValue() > currentCard.getValue()) { // next card higher
                    if (guess.equals('H')) {
                        System.out.println("Your prediction was correct.");
                        correctGuesses++;
                    } else {
                        System.out.println("Your prediction was incorrect.");
                        break;  // End the game.
                    }
                } else {  // nextCard is lower
                    if (guess.equals('L')) {
                        System.out.println("Your prediction was correct.");
                        correctGuesses++;
                    } else {
                        System.out.println("Your prediction was incorrect.");
                        break;  // End the game.
                    }
                }
                // Set current card equal to next card
                currentCard = nextCard;
                System.out.println();
                System.out.println("The card is " + currentCard);

            } // game over

            System.out.println();
            System.out.println("The game is over.");
            System.out.println("You made " + correctGuesses
                    + " correct predictions.");
            System.out.println();

            return correctGuesses;

        }  // end play method


    } // end of HighLow calss

