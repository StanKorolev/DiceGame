package DiceGame;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashMap;


public class Main {

    private static final Logger logger = LogManager.getLogger(Game.class);

    public static void main(String[] args) {

        Game newGame = new Game();
//        String fileName = "GameRecord.txt";
//        newGame.createFile(fileName);
//        newGame.writeToFile("GameRecord.txt", "The winner of the Game is " + newGame.startGame() + " with " + newGame.getFinalResult()+ " number on dice ");
        logger.info("The winner is " + newGame.startGame() + " with " + newGame.getFinalResult() + " on dice");
        logger.info("Finish Game");
    }
}