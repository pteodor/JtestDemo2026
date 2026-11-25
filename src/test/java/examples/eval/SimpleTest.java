package examples.eval;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/**
 * Parasoft Jtest UTA: Test class for Simple
 *
 * @see examples.eval.Simple
 * @author pteodor
 */
public class SimpleTest
{

    /**
     * Parasoft Jtest UTA: Test for map(int)
     *
     * @see examples.eval.Simple#map(int)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testMap() throws Throwable
    {
        // When
        int index = 0; // UTA: configured value
        int result = Simple.map(index);

        // Then - assertions for result of method map(int)
        assertEquals(-1, result);

    }

    /**
     * Parasoft Jtest UTA: Test for map(int)
     *
     * @see examples.eval.Simple#map(int)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testMap2() throws Throwable
    {
        // When
        int index = 2; // UTA: configured value
        int result = Simple.map(index);

        // Then - assertions for result of method map(int)
        assertEquals(0, result);

    }

    /**
     * Parasoft Jtest UTA: Test for map(int)
     *
     * @see examples.eval.Simple#map(int)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testMap3() throws Throwable
    {
        // When
        int index = 1; // UTA: configured value
        int result = Simple.map(index);

        // Then - assertions for result of method map(int)
        assertEquals(-2, result);

    }

    /**
     * Parasoft Jtest UTA: Test for startsWith(String, String)
     *
     * @see examples.eval.Simple#startsWith(String, String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testStartsWith() throws Throwable
    {
        // When
        String str = "str"; // UTA: default value
        String match = ""; // UTA: configured value
        boolean result = Simple.startsWith(str, match);

        // Then - assertions for result of method startsWith(String, String)
        assertTrue(result);

    }

    /**
     * Parasoft Jtest UTA: Test for startsWith(String, String)
     *
     * @see examples.eval.Simple#startsWith(String, String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testStartsWith2() throws Throwable
    {
        // When
        String str = "\u0001"; // UTA: configured value
        String match = "match"; // UTA: configured value
        boolean result = Simple.startsWith(str, match);

        // Then - assertions for result of method startsWith(String, String)
        assertFalse(result);

    }

}
