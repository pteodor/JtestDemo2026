package examples.stackmachine;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
/**
 * Parasoft Jtest UTA: Test class for FifoStackMachine
 *
 * @see examples.stackmachine.FifoStackMachine
 * @author pteodor
 */
public class FifoStackMachineTest
{

    /**
     * Parasoft Jtest UTA: Test for push(String)
     *
     * @see examples.stackmachine.FifoStackMachine#push(String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testPush() throws Throwable
    {
        // Given
        FifoStackMachine underTest = new FifoStackMachine();

        // When
        String value = "value"; // UTA: default value
        underTest.push(value);

    }

    /**
     * Parasoft Jtest UTA: Test for pushInt(int)
     *
     * @see examples.stackmachine.FifoStackMachine#pushInt(int)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testPushInt() throws Throwable
    {
        // Given
        FifoStackMachine underTest = new FifoStackMachine();

        // When
        int value = 1; // UTA: default value
        underTest.pushInt(value);

    }

    /**
     * Parasoft Jtest UTA: Test for isInteger(String)
     *
     * @see examples.stackmachine.AbstractStackMachine#isInteger(String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testIsInteger() throws Throwable
    {
        // Given
        FifoStackMachine underTest = new FifoStackMachine();

        // When
        String string = "string"; // UTA: default value
        boolean result = underTest.isInteger(string);

        // Then - assertions for result of method isInteger(String)
        assertFalse(result);

    }

}
