package examples.junit;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
/**
 * Parasoft Jtest UTA: Test class for IntegerComparator
 *
 * @see examples.junit.IntegerComparator
 * @author pteodor
 */
public class IntegerComparatorTest
{

    /**
     * Parasoft Jtest UTA: Test for isGreater(int, int)
     *
     * @see examples.junit.IntegerComparator#isGreater(int, int)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testIsGreater() throws Throwable
    {
        // When
        int val1 = 1; // UTA: default value
        int val2 = 1; // UTA: default value
        boolean result = IntegerComparator.isGreater(val1, val2);

        // Then - assertions for result of method isGreater(int, int)
        assertFalse(result);

    }
}
