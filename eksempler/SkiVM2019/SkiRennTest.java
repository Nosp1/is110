

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SkiRennTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SkiRennTest
{
    private SkiRenn skiRenn1;
    private Person person1;
    private Person person2;
    private Deltaker deltaker1;
    private Deltaker deltaker2;

    /**
     * Default constructor for test class SkiRennTest
     */
    public SkiRennTest()
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
        skiRenn1 = new SkiRenn("Friteknikk ", "30 km", 'K');
        person1 = new Person("Therese", "Johaug");
        person2 = new Person("Mari", "Kalla");
        deltaker1 = new Deltaker(person1);
        deltaker2 = new Deltaker(person2);
        skiRenn1.nyDeltaker(deltaker1);
        skiRenn1.nyDeltaker(deltaker2);
        skiRenn1.skrivAlle();
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
