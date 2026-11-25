package examples.suppress;

import org.junit.Test;
/**
 * Parasoft Jtest UTA: Test class for AllFileSuppress
 *
 * @see examples.suppress.AllFileSuppress
 * @author pteodor
 */
public class AllFileSuppressTest
{

    /**
     * Parasoft Jtest UTA: Test for main(String[])
     *
     * @see examples.suppress.AllFileSuppress#main(String[])
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testMain() throws Throwable
    {
        // When
        String[] args = new String[1]; // UTA: default value
        args[0] = "args[0]"; // UTA: default value
        AllFileSuppress.main(args);

    }
}
