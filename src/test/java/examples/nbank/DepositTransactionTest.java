package examples.nbank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Parasoft Jtest UTA: Test class for DepositTransaction
 *
 * @see examples.nbank.DepositTransaction
 * @author pteodor
 */
public class DepositTransactionTest
{

    /**
     * Parasoft Jtest UTA: Test for apply(Account)
     *
     * @see examples.nbank.DepositTransaction#apply(Account)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testApply() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        DepositTransaction underTest = new DepositTransaction(amount);

        // When
        Account account = mock(Account.class);
        Customer getCustomerResult = mock(Customer.class);
        String getNameResult = ""; // UTA: configured value
        when(getCustomerResult.getName()).thenReturn(getNameResult);
        when(account.getCustomer()).thenReturn(getCustomerResult);
        boolean result = underTest.apply(account);

        // Then - assertions for result of method apply(Account)
        assertTrue(result);

    }

    /**
     * Parasoft Jtest UTA: Test for apply(Account)
     *
     * @see examples.nbank.DepositTransaction#apply(Account)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testApply2() throws Throwable
    {
        // Given
        int amount = 1; // UTA: configured value
        DepositTransaction underTest = new DepositTransaction(amount);

        // When
        Account account = mock(Account.class);
        int getBalanceResult = 100; // UTA: configured value
        when(account.getBalance()).thenReturn(getBalanceResult);

        Customer getCustomerResult = mock(Customer.class);
        String getNameResult = "John Hacker"; // UTA: configured value
        when(getCustomerResult.getName()).thenReturn(getNameResult);
        when(account.getCustomer()).thenReturn(getCustomerResult);
        boolean result = underTest.apply(account);

        // Then - assertions for result of method apply(Account)
        assertTrue(result);

    }

    /**
     * Parasoft Jtest UTA: Test for fee()
     *
     * @see examples.nbank.AbstractTransaction#fee()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testFee() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        DepositTransaction underTest = new DepositTransaction(amount);

        // When
        int result = underTest.fee();

        // Then - assertions for result of method fee()
        assertEquals(0, result);

    }
}
