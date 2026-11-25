package examples.flowanalysis;

import org.junit.Test;

import examples.flowanalysis.DivisionByZero.Consumer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
/**
 * Parasoft Jtest UTA: Test class for DivisionByZero
 *
 * @see examples.flowanalysis.DivisionByZero
 * @author pteodor
 */
public class DivisionByZeroTest
{

    /**
     * Parasoft Jtest UTA: Test for calculateDiscountedSum(int, float, Consumer)
     *
     * @see examples.flowanalysis.DivisionByZero#calculateDiscountedSum(int, float, Consumer)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testCalculateDiscountedSum() throws Throwable
    {
        // When
        int code = 1; // UTA: configured value
        float initialSum = 5; // UTA: configured value
        Consumer person = mock(Consumer.class);
        float result = DivisionByZero.calculateDiscountedSum(code, initialSum, person);

        // Then - assertions for result of method calculateDiscountedSum(int, float, DivisionByZero.Consumer)
        assertEquals(0.0f, result, 0.0);

    }

    /**
     * Parasoft Jtest UTA: Test for calculateDiscountedSum(int, float, Consumer)
     *
     * @see examples.flowanalysis.DivisionByZero#calculateDiscountedSum(int, float, Consumer)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testCalculateDiscountedSum2() throws Throwable
    {
        // When
        int code = 1; // UTA: configured value
        float initialSum = 6; // UTA: configured value
        Consumer person = mock(Consumer.class);
        float result = DivisionByZero.calculateDiscountedSum(code, initialSum, person);

        // Then - assertions for result of method calculateDiscountedSum(int, float, DivisionByZero.Consumer)
        assertEquals(5.7f, result, 0.0);

    }

    /**
     * Parasoft Jtest UTA: Test for calculateDiscountedSum(int, float, Consumer)
     *
     * @see examples.flowanalysis.DivisionByZero#calculateDiscountedSum(int, float, Consumer)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testCalculateDiscountedSum3() throws Throwable
    {
        // When
        int code = 1; // UTA: configured value
        float initialSum = 4; // UTA: configured value
        Consumer person = mock(Consumer.class);
        float result = DivisionByZero.calculateDiscountedSum(code, initialSum, person);

        // Then - assertions for result of method calculateDiscountedSum(int, float, DivisionByZero.Consumer)
        assertEquals(3.92f, result, 0.0);

    }

    /**
     * Parasoft Jtest UTA: Test for calculateDiscountedSum(int, float, Consumer)
     *
     * @see examples.flowanalysis.DivisionByZero#calculateDiscountedSum(int, float, Consumer)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testCalculateDiscountedSum4() throws Throwable
    {
        // When
        int code = 0; // UTA: configured value
        float initialSum = 5; // UTA: configured value
        Consumer person = mock(Consumer.class);
        float result = DivisionByZero.calculateDiscountedSum(code, initialSum, person);

        // Then - assertions for result of method calculateDiscountedSum(int, float, DivisionByZero.Consumer)
        assertEquals(0.0f, result, 0.0);

    }

}
