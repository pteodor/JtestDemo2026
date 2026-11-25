package examples.flowanalysis;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
/**
 * Parasoft Jtest UTA: Test class for InefficientMapRemoval
 *
 * @see examples.flowanalysis.InefficientMapRemoval
 * @author pteodor
 */
public class InefficientMapRemovalTest
{

    /**
     * Parasoft Jtest UTA: Test for effectiveRemoval(Map)
     *
     * @see examples.flowanalysis.InefficientMapRemoval#effectiveRemoval(Map)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testEffectiveRemoval() throws Throwable
    {
        // Given
        InefficientMapRemoval underTest = new InefficientMapRemoval();

        // When
        Map<Object, Object> map = new HashMap<Object, Object>(); // UTA: default value
        underTest.effectiveRemoval(map);

    }

    /**
     * Parasoft Jtest UTA: Test for effectiveRemovalKeySet(Map)
     *
     * @see examples.flowanalysis.InefficientMapRemoval#effectiveRemovalKeySet(Map)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testEffectiveRemovalKeySet() throws Throwable
    {
        // Given
        InefficientMapRemoval underTest = new InefficientMapRemoval();

        // When
        Map<Object, Object> map = new HashMap<Object, Object>(); // UTA: default value
        underTest.effectiveRemovalKeySet(map);

    }

    /**
     * Parasoft Jtest UTA: Test for inefficientRemoval(Map)
     *
     * @see examples.flowanalysis.InefficientMapRemoval#inefficientRemoval(Map)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testInefficientRemoval() throws Throwable
    {
        // Given
        InefficientMapRemoval underTest = new InefficientMapRemoval();

        // When
        Map<Object, Object> map = new HashMap<Object, Object>(); // UTA: default value
        underTest.inefficientRemoval(map);

    }

    /**
     * Parasoft Jtest UTA: Test for inefficientRemoval(Map)
     *
     * @see examples.flowanalysis.InefficientMapRemoval#inefficientRemoval(Map)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testInefficientRemoval2() throws Throwable
    {
        // Given
        InefficientMapRemoval underTest = new InefficientMapRemoval();

        // When
        Map<Object, Object> map = new HashMap<Object, Object>(); // UTA: default value
        Object key = new Object(); // UTA: default value
        Object value = new Object(); // UTA: default value
        map.put(key, value);
        underTest.inefficientRemoval(map);

        // Then - assertions for argument 1 of method inefficientRemoval(Map)
        assertNotNull(map);
        assertEquals(0, map.size());

    }

    /**
     * Parasoft Jtest UTA: Test for inefficientRemovalEntry(Map)
     *
     * @see examples.flowanalysis.InefficientMapRemoval#inefficientRemovalEntry(Map)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testInefficientRemovalEntry() throws Throwable
    {
        // Given
        InefficientMapRemoval underTest = new InefficientMapRemoval();

        // When
        Map<Object, Object> map = new HashMap<Object, Object>(); // UTA: default value
        underTest.inefficientRemovalEntry(map);

    }

    /**
     * Parasoft Jtest UTA: Test for inefficientRemovalEntry(Map)
     *
     * @see examples.flowanalysis.InefficientMapRemoval#inefficientRemovalEntry(Map)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testInefficientRemovalEntry2() throws Throwable
    {
        // Given
        InefficientMapRemoval underTest = new InefficientMapRemoval();

        // When
        Map<Object, Object> map = new HashMap<Object, Object>(); // UTA: default value
        Object key = new Object(); // UTA: default value
        Object value = new Object(); // UTA: default value
        map.put(key, value);
        underTest.inefficientRemovalEntry(map);

        // Then - assertions for argument 1 of method inefficientRemovalEntry(Map)
        assertNotNull(map);
        assertEquals(0, map.size());

    }
}
