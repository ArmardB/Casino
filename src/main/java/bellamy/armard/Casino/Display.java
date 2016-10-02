package bellamy.armard.Casino;

/**
 * Created by armardbellamy on 10/2/16.
 */
public class Display {

    public void welcomeScreen(){
        System.out.println("Welcome to the Casino");
        System.out.println("Choose your game: ");
        System.out.println("[1] High Low");
        System.out.println("[2] XXXXXXXX");
        System.out.println("[3] XXXXXXXX");
    }

    public void highLowWelcome(){
        System.out.println("[####################################################]");
        System.out.println("[             Welcome to High Low!                   ]");
        System.out.println("[            The rules are simple:                   ]");
        System.out.println("[        You will be presented by a card.            ]");
        System.out.println("[   Guess if the next card will be higher or lower.  ]");
        System.out.println("[                   Good luck!!!!                    ]");
        System.out.println("[####################################################]");
    }
}
