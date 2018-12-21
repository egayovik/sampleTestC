import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    //TODO
    //add new tests for add() method

    @Test
    public void testDivisionTwoPositiveValues() {
        assertEquals( "20 / 2  must  be 10", 10.0, calc.division( 20, 2));

    }
    @Test
    public void testSubtractionTwoPositiveValues() {
        assertEquals("20 - 2  must  be 18", 18, calc.subtraction(20, 2));

    }

    @Test
    public void testSquareRootPossitiveValue() {
        assertEquals("16  must  be 4", 4.0, calc.squareRoot(16));
    }
    @Test
    public void testXpov2PossiriveVelue() {
        assertEquals("4  must  be 16", 16.0, calc.xPov2(4));
    }

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
