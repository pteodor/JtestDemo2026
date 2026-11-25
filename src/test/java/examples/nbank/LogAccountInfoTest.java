package examples.nbank;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Parasoft Jtest UTA: Test class for LogAccountInfo
 *
 * @see examples.nbank.LogAccountInfo
 * @author pteodor
 */
public class LogAccountInfoTest
{

    /**
     * Parasoft Jtest UTA: Test for log(Account)
     *
     * @see examples.nbank.LogAccountInfo#log(Account)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testLog() throws Throwable
    {
        // Given
        LogAccountInfo underTest = new LogAccountInfo();

        // When
        Account account = mock(Account.class);
        String getIDResult = "getIDResult"; // UTA: default value
        when(account.getID()).thenReturn(getIDResult);
        boolean result = underTest.log(account);

        // Then - assertions for result of method log(Account)
        assertTrue(result);

    }
}
