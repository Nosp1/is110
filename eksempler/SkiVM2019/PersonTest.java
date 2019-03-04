

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PersonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonTest
{
    private Person person1;
    private Deltaker deltaker1;
    private SkiRenn skiRenn1;

    /**
     * Default constructor for test class PersonTest
     */
    public PersonTest()
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
        person1 = new Person("Therese", "Johaug");
        deltaker1 = new Deltaker(person1);
        skiRenn1 = new SkiRenn("26 feb 19", "30 fri", 'K');
        skiRenn1.nyDeltaker(deltaker1);
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

    @Test
    public void forNavn()
    {
        Person person1 = new Person("Therese", "Johaug");
        assertEquals("Therese", person1.getForNavn());
    }

    @Test
    public void etterNavn()
    {
        assertEquals("Johaug", person1.getEtterNavn());
    }
}


