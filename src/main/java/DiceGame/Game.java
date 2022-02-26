package DiceGame;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.util.Scanner;

public class Game {

    private static final Logger logger = LogManager.getLogger(Game.class);

    private int firstResult;
    private int secondResult;
    private int finalResult;
    private final Dice dice;
    Player nameOne = new Player();
    Player nameTwo = new Player();

    //Game constructor to create object dice, belongs to class Dice
    public Game() {
        Dice dice = new Dice();
        this.dice = dice;
    }

    public int getFirstResult() {
        return firstResult;
    }

    public void setFirstResult(int firstResult) {
        this.firstResult = firstResult;
    }

    public int getSecondResult() {
        return secondResult;
    }

    public void setSecondResult(int secondResult) {
        this.secondResult = secondResult;
    }

    public int getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(int finalResult) {
        this.finalResult = finalResult;
    }

    public String startGame() {

        logger.info("Start Game");

        Scanner scanner = new Scanner(System.in);
        System.out.println("First name?");
        String name1 = scanner.next();
        nameOne.setName(name1);

        logger.info("Name One is " + nameOne.getName());

        System.out.println("Second name?");
        String name2 = scanner.next();
        nameTwo.setName(name2);

        logger.info("Name Twi is " + nameTwo.getName());


        System.out.println("Dice size?");
        int diceSize = scanner.nextInt();
        dice.setNumSides(diceSize);
        dice.rollMyDice();

        logger.info("Dice size is " + dice.getNumSides());

        setFirstResult(dice.rollMyDice());
        setSecondResult(dice.rollMyDice());

        System.out.println(name1 + " throw " + getFirstResult());
        System.out.println(name2 + " throw " + getSecondResult());

        if (getFirstResult() == getSecondResult()) {
            System.out.println("Equal");
        } else {
            System.out.println();
            if (getFirstResult() < getSecondResult()) {
                setFinalResult(getSecondResult());
                System.out.println("Player " + name2 + " wins");
            } else {
                System.out.println("Player " + name1 + " wins");
                setFinalResult(getFirstResult());
            }
        }
        logger.info(nameOne.getName() + " throw " + getFirstResult());
        logger.info(nameTwo.getName() + " throw " + getSecondResult());

        return name1;
    }

    public void createFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String fileName, String myText) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(myText);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File isn't found");
            e.printStackTrace();
        }
    }

}





