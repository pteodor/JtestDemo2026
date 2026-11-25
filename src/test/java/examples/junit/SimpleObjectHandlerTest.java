package examples.junit;

import java.util.Collection;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
/**
 * Parasoft Jtest UTA: Test class for SimpleObjectHandler
 *
 * @see examples.junit.SimpleObjectHandler
 * @author pteodor
 */
public class SimpleObjectHandlerTest
{

    /**
     * Parasoft Jtest UTA: Test for getElement()
     *
     * @see examples.junit.SimpleObjectHandler#getElement()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testGetElement() throws Throwable
    {
        // Given
        Object element = new Object(); // UTA: default value
        SimpleObjectHandler underTest = new SimpleObjectHandler(element);

        // When
        Object result = underTest.getElement();

        // Then - assertions for result of method getElement()
        assertNotNull(result);

    }

    /**
     * Parasoft Jtest UTA: Test for getList()
     *
     * @see examples.junit.SimpleObjectHandler#getList()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testGetList() throws Throwable
    {
        // When
        Collection<Integer> result = SimpleObjectHandler.getList();

        // Then - assertions for result of method getList()
        assertNotNull(result);
        assertEquals(0, result.size());

    }

    /**
     * Parasoft Jtest UTA: Test for getMap()
     *
     * @see examples.junit.SimpleObjectHandler#getMap()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testGetMap() throws Throwable
    {
        // When
        Map<Object, Object> result = SimpleObjectHandler.getMap();

        // Then - assertions for result of method getMap()
        assertNotNull(result);
        assertEquals(0, result.size());

    }

    /**
     * Parasoft Jtest UTA: Test for getString()
     *
     * @see examples.junit.SimpleObjectHandler#getString()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testGetString() throws Throwable
    {
        // Given
        Object element = new Object(); // UTA: default value
        SimpleObjectHandler underTest = new SimpleObjectHandler(element);

        // When
        String result = underTest.getString();

        // Then - assertions for result of method getString()
        assertEquals("", result);

        // Then - assertions for this instance of SimpleObjectHandler
        assertNotNull(underTest.getElement());

    }
}
