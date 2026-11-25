package examples.nbank;

import org.junit.Test;

import static org.mockito.Mockito.mock;
/**
 * Parasoft Jtest UTA: Test class for Customer
 *
 * @see examples.nbank.Customer
 * @author pteodor
 */
public class CustomerTest
{

    /**
     * Parasoft Jtest UTA: Test for main(String[])
     *
     * @see examples.nbank.Customer#main(String[])
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testMain() throws Throwable
    {
        // When
        String[] args = new String[1]; // UTA: default value
        args[0] = "args[0]"; // UTA: default value
        Customer.main(args);

    }

}
