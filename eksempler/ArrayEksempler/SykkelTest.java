

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SykkelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SykkelTest
{
    private Sykkel sykkel1;
    private Sykkel sykkel2;
    private Sykkel sykkel3;
    private Sykkel sykkel4;

    /**
     * Default constructor for test class SykkelTest
     */
    public SykkelTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        sykkel1 = new Sykkel("Bysykkel, Herre", "Grå", 4000);
        sykkel2 = new Sykkel("Terreng, Herre", "Neon pink", 25000);
        sykkel3 = new Sykkel("Klassisk damesykkel", "Rød", 2000);
        sykkel4 = new Sykkel("Landeveisracer, karbon", "Sort", 100000);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
