import DiceGame.Dice;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;


public class DiceTest {

    @BeforeAll
    public static void classSetup() {
        System.out.println("Start tests");
    }

    @AfterAll
    public static void classTearDown() {
        System.out.println("Finish tests");
    }


    @Test
    public void diceSetupTest() {

        Dice rollMyDiceTest = new Dice();
        int actualNumSide = 10;

        rollMyDiceTest.setNumSides(actualNumSide);
        rollMyDiceTest.rollMyDice();

        assertEquals(actualNumSide, rollMyDiceTest.getNumSides());

        assertNotEquals(rollMyDiceTest.getMinNum(), rollMyDiceTest.getNumSides());

        assertTrue(rollMyDiceTest.getNumSides() > 0);

        assertTrue(rollMyDiceTest.getMinNum() > 0);
    }

    @Test
    public void diceRandomTest() {

        Dice rollMyDiceTest = new Dice();
        int actualNumSide = 10;

        rollMyDiceTest.setNumSides(actualNumSide);
        rollMyDiceTest.rollMyDice();

        assertTrue(rollMyDiceTest.getValue() > 0);

        assertNotNull(rollMyDiceTest);

    }
}
