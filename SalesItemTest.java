

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
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
    public void getName_test()
    {
        SalesItem test_item = new SalesItem("Nick", 123);
        assertSame("Nick", test_item.getName());
    }
    
    @Test
    public void getPrice_test()
    {
        SalesItem test_item = new SalesItem("Nick", 123);
        assertSame(123, test_item.getPrice());
    }

}

