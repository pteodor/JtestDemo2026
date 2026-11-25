package examples.junit;

import java.lang.reflect.Field;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Parasoft Jtest UTA: Test class for CustomMoney
 *
 * @see examples.junit.CustomMoney
 * @author pteodor
 */
public class CustomMoneyTest
{

    /**
     * Parasoft Jtest UTA: Test for changeCurrency(String)
     *
     * @see examples.junit.CustomMoney#changeCurrency(String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testChangeCurrency() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        String currency = "currency"; // UTA: default value
        CustomMoney underTest = new CustomMoney(amount, currency);

        // When
        String currency2 = "currency2"; // UTA: default value
        underTest.changeCurrency(currency2);

        // Then - assertions for this instance of CustomMoney
        assertEquals(1, underTest.amount());
        assertEquals("currency2", underTest.fCurrency);

    }

    /**
     * Parasoft Jtest UTA: Test for add(IMoney)
     *
     * @see examples.junit.Money#add(IMoney)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testAdd() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        String currency = "currency"; // UTA: default value
        CustomMoney underTest = new CustomMoney(amount, currency);

        // When
        IMoney m = mock(IMoney.class);
        IMoney result = underTest.add(m);

        // Then - assertions for result of method add(IMoney)
        assertNull(result);

        // Then - assertions for this instance of CustomMoney
        assertEquals(1, underTest.amount());
        assertEquals("currency", underTest.fCurrency);

    }

    /**
     * Parasoft Jtest UTA: Test for addMoney(Money)
     *
     * @see examples.junit.Money#addMoney(Money)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testAddMoney() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        String currency = "currency"; // UTA: default value
        CustomMoney underTest = new CustomMoney(amount, currency);

        // When
        Money m = mock(Money.class);
        String currencyResult = "currencyResult"; // UTA: configured value
        when(m.currency()).thenReturn(currencyResult);
        IMoney result = underTest.addMoney(m);

        // Then - assertions for result of method addMoney(Money)
        assertNotNull(result);

        // Then - assertions for this instance of CustomMoney
        assertEquals(1, underTest.amount());
        assertEquals("currency", underTest.fCurrency);

    }

    /**
     * Parasoft Jtest UTA: Test for addMoney(Money)
     *
     * @see examples.junit.Money#addMoney(Money)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testAddMoney2() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        String currency = "currency"; // UTA: default value
        CustomMoney underTest = new CustomMoney(amount, currency);
        setPrivateField(underTest, Money.class, "fAmount", 0); // UTA: configured value

        // When
        Money m = mock(Money.class);
        String currencyResult = "currencyResult"; // UTA: configured value
        when(m.currency()).thenReturn(currencyResult);
        IMoney result = underTest.addMoney(m);

        // Then - assertions for result of method addMoney(Money)
        assertNotNull(result);

        // Then - assertions for this instance of CustomMoney
        assertEquals(0, underTest.amount());
        assertEquals("currency", underTest.fCurrency);

    }

    /**
     * Parasoft Jtest UTA: Helper method to set private field fAmount
     */
    private static <T> void setPrivateField(Object object, Class<?> fieldClass, String fieldName, T value)
    {
        try {
            Field field = fieldClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(object, value);
        } catch (NoSuchFieldException e) {
            throw (AssertionError) new AssertionError("No such field found").initCause(e);
        } catch (IllegalAccessException e) {
            throw (AssertionError) new AssertionError("Unable to access the specified private field").initCause(e);
        } catch (SecurityException e) {
            throw (AssertionError) new AssertionError("There was a security exception when attempting to access a private field").initCause(e);
        }
    }

    /**
     * Parasoft Jtest UTA: Test for addMoneyBag(MoneyBag)
     *
     * @see examples.junit.Money#addMoneyBag(MoneyBag)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testAddMoneyBag() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        String currency = "currency"; // UTA: default value
        CustomMoney underTest = new CustomMoney(amount, currency);

        // When
        MoneyBag s = mock(MoneyBag.class);
        IMoney result = underTest.addMoneyBag(s);

        // Then - assertions for result of method addMoneyBag(MoneyBag)
        assertNull(result);

        // Then - assertions for this instance of CustomMoney
        assertEquals(1, underTest.amount());
        assertEquals("currency", underTest.fCurrency);

    }

    /**
     * Parasoft Jtest UTA: Test for equals(Object)
     *
     * @see examples.junit.Money#equals(Object)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testEquals() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        String currency = "currency"; // UTA: default value
        CustomMoney underTest = new CustomMoney(amount, currency);
        setPrivateField(underTest, Money.class, "fAmount", 0); // UTA: configured value

        // When
        Object anObject = new Object(); // UTA: default value
        boolean result = underTest.equals(anObject);

        // Then - assertions for result of method equals(Object)
        assertFalse(result);

        // Then - assertions for this instance of CustomMoney
        assertEquals(0, underTest.amount());
        assertEquals("currency", underTest.fCurrency);

    }

    /**
     * Parasoft Jtest UTA: Test for hashCode()
     *
     * @see examples.junit.Money#hashCode()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testHashCode() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        String currency = "currency"; // UTA: default value
        CustomMoney underTest = new CustomMoney(amount, currency);
        setPrivateField(underTest, Money.class, "fAmount", 0); // UTA: configured value

        // When
        int result = underTest.hashCode();

        // Then - assertions for result of method hashCode()
        // assertEquals(1, result);// UTA: Expected value may be unstable

        // Then - assertions for this instance of CustomMoney
        assertEquals(0, underTest.amount());
        assertEquals("currency", underTest.fCurrency);

    }

    /**
     * Parasoft Jtest UTA: Test for hashCode()
     *
     * @see examples.junit.Money#hashCode()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testHashCode2() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        String currency = "currency"; // UTA: default value
        CustomMoney underTest = new CustomMoney(amount, currency);
        String fCurrencyValue = "fCurrencyValue"; // UTA: default value
        underTest.fCurrency = fCurrencyValue;
        setPrivateField(underTest, Money.class, "fAmount", 1); // UTA: configured value

        // When
        int result = underTest.hashCode();

        // Then - assertions for result of method hashCode()
        // assertEquals(1, result);// UTA: Expected value may be unstable

        // Then - assertions for this instance of CustomMoney
        assertEquals(1, underTest.amount());
        assertEquals("fCurrencyValue", underTest.fCurrency);

    }

    /**
     * Parasoft Jtest UTA: Test for multiply(int)
     *
     * @see examples.junit.Money#multiply(int)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testMultiply() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        String currency = "currency"; // UTA: default value
        CustomMoney underTest = new CustomMoney(amount, currency);

        // When
        int factor = 1; // UTA: default value
        IMoney result = underTest.multiply(factor);

        // Then - assertions for result of method multiply(int)
        assertNotNull(result);

        // Then - assertions for this instance of CustomMoney
        assertEquals(1, underTest.amount());
        assertEquals("currency", underTest.fCurrency);

    }

    /**
     * Parasoft Jtest UTA: Test for negate()
     *
     * @see examples.junit.Money#negate()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testNegate() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        String currency = "currency"; // UTA: default value
        CustomMoney underTest = new CustomMoney(amount, currency);

        // When
        IMoney result = underTest.negate();

        // Then - assertions for result of method negate()
        assertNotNull(result);

        // Then - assertions for this instance of CustomMoney
        assertEquals(1, underTest.amount());
        assertEquals("currency", underTest.fCurrency);

    }

    /**
     * Parasoft Jtest UTA: Test for subtract(IMoney)
     *
     * @see examples.junit.Money#subtract(IMoney)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testSubtract() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        String currency = "currency"; // UTA: default value
        CustomMoney underTest = new CustomMoney(amount, currency);

        // When
        IMoney m = mock(IMoney.class);
        IMoney negateResult = mock(IMoney.class);
        when(m.negate()).thenReturn(negateResult);
        IMoney result = underTest.subtract(m);

        // Then - assertions for result of method subtract(IMoney)
        assertNull(result);

        // Then - assertions for this instance of CustomMoney
        assertEquals(1, underTest.amount());
        assertEquals("currency", underTest.fCurrency);

    }

    /**
     * Parasoft Jtest UTA: Test for toString()
     *
     * @see examples.junit.Money#toString()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testToString() throws Throwable
    {
        // Given
        int amount = 1; // UTA: default value
        String currency = "currency"; // UTA: default value
        CustomMoney underTest = new CustomMoney(amount, currency);
        String fCurrencyValue = "fCurrencyValue"; // UTA: default value
        underTest.fCurrency = fCurrencyValue;

        // When
        String result = underTest.toString();

        // Then - assertions for result of method toString()
        assertEquals("[1 fCurrencyValue]", result);

        // Then - assertions for this instance of CustomMoney
        assertEquals(1, underTest.amount());
        assertEquals("fCurrencyValue", underTest.fCurrency);

    }
}
