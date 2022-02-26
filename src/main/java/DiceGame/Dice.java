package DiceGame;

import java.util.Random;

public class Dice {

    private int numSides;
    private static int value;
    private int minNum = 1;


    public int getNumSides() {
        return numSides;
    }
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }
    public  int getValue() {
        return value;
    }
    public  void setValue(int value) {
        Dice.value = value;
    }
    public int getMinNum() {
        return minNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }


    public Dice() {

    }

    public int rollMyDice(){
        Random random = new Random();
        value = random.nextInt((numSides-minNum)+1) + minNum;
        return value;
    }

}


