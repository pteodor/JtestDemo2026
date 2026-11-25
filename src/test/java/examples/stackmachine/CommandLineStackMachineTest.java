package examples.stackmachine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Parasoft Jtest UTA: Test class for CommandLineStackMachine
 *
 * @see examples.stackmachine.CommandLineStackMachine
 * @author pteodor
 */
public class CommandLineStackMachineTest
{

    /**
     * Parasoft Jtest UTA: Test for getStack()
     *
     * @see examples.stackmachine.CommandLineStackMachine#getStack()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testGetStack() throws Throwable
    {
        // When
        String result = CommandLineStackMachine.getStack();

        // Then - assertions for result of method getStack()
        assertEquals("[]", result);

    }

    /**
     * Parasoft Jtest UTA: Test for main(String[])
     *
     * @see examples.stackmachine.CommandLineStackMachine#main(String[])
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testMain() throws Throwable
    {
        // When
        String[] args = new String[1]; // UTA: configured value
        args[0] = "args[0]"; // UTA: default value
        CommandLineStackMachine.main(args);

    }

}
