package examples.nbank;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
/**
 * Parasoft Jtest UTA: Test class for CreditCard
 *
 * @see examples.nbank.CreditCard
 * @author pteodor
 */
public class CreditCardTest
{

    /**
     * Parasoft Jtest UTA: Test for validate(int[], String)
     *
     * @see examples.nbank.CreditCard#validate(int[], String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testValidate() throws Throwable
    {
        // When
        int[] digLengths = new int[1]; // UTA: default value
        digLengths[0] = 1; // UTA: default value
        String input = "input"; // UTA: default value
        boolean result = CreditCard.validate(digLengths, input);

        // Then - assertions for result of method validate(int[], String)
        assertFalse(result);

    }

    /**
     * Parasoft Jtest UTA: Test for validate(int[], String)
     *
     * @see examples.nbank.CreditCard#validate(int[], String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testValidate2() throws Throwable
    {
        // When
        int[] digLengths = new int[2]; // UTA: configured value
        digLengths[0] = 0; // UTA: configured value
        digLengths[1] = 1;
        String input = ""; // UTA: configured value
        boolean result = CreditCard.validate(digLengths, input);

        // Then - assertions for result of method validate(int[], String)
        assertFalse(result);

    }

    /**
     * Parasoft Jtest UTA: Test for validate(int[], String)
     *
     * @see examples.nbank.CreditCard#validate(int[], String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testValidate3() throws Throwable
    {
        // When
        int[] digLengths = new int[1]; // UTA: configured value
        digLengths[0] = 0; // UTA: configured value
        String input = "input"; // UTA: default value
        boolean result = CreditCard.validate(digLengths, input);

        // Then - assertions for result of method validate(int[], String)
        assertFalse(result);

    }

}
