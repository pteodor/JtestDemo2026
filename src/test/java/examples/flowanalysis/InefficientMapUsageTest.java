package examples.flowanalysis;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
/**
 * Parasoft Jtest UTA: Test class for InefficientMapUsage
 *
 * @see examples.flowanalysis.InefficientMapUsage
 * @author pteodor
 */
public class InefficientMapUsageTest
{

    /**
     * Parasoft Jtest UTA: Test for effectiveIteration(Map)
     *
     * @see examples.flowanalysis.InefficientMapUsage#effectiveIteration(Map)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testEffectiveIteration() throws Throwable
    {
        // Given
        InefficientMapUsage underTest = new InefficientMapUsage();

        // When
        Map<Object, Object> map = new HashMap<Object, Object>(); // UTA: default value
        underTest.effectiveIteration(map);

    }

    /**
     * Parasoft Jtest UTA: Test for effectiveIteration(Map)
     *
     * @see examples.flowanalysis.InefficientMapUsage#effectiveIteration(Map)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testEffectiveIteration2() throws Throwable
    {
        // Given
        InefficientMapUsage underTest = new InefficientMapUsage();

        // When
        Map<Object, Object> map = new HashMap<Object, Object>(); // UTA: default value
        Object key = new Object(); // UTA: default value
        Object value = new Object(); // UTA: default value
        map.put(key, value);
        underTest.effectiveIteration(map);

    }

    /**
     * Parasoft Jtest UTA: Test for inefficientIteration(Map)
     *
     * @see examples.flowanalysis.InefficientMapUsage#inefficientIteration(Map)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testInefficientIteration() throws Throwable
    {
        // Given
        InefficientMapUsage underTest = new InefficientMapUsage();

        // When
        Map<Object, Object> map = new HashMap<Object, Object>(); // UTA: default value
        underTest.inefficientIteration(map);

    }

    /**
     * Parasoft Jtest UTA: Test for inefficientIteration(Map)
     *
     * @see examples.flowanalysis.InefficientMapUsage#inefficientIteration(Map)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testInefficientIteration2() throws Throwable
    {
        // Given
        InefficientMapUsage underTest = new InefficientMapUsage();

        // When
        Map<Object, Object> map = new HashMap<Object, Object>(); // UTA: default value
        Object key = new Object(); // UTA: default value
        Object value = new Object(); // UTA: default value
        map.put(key, value);
        underTest.inefficientIteration(map);

    }
}
