package examples.queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * Parasoft Jtest UTA: Test class for Queue
 *
 * @see examples.queue.Queue
 * @author pteodor
 */
public class QueueTest
{

    /**
     * Parasoft Jtest UTA: Test for add(String)
     *
     * @see examples.queue.Queue#add(String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testAdd() throws Throwable
    {
        // Given
        Queue underTest = new Queue();

        // When
        String item = "item"; // UTA: default value
        underTest.add(item);

    }

    /**
     * Parasoft Jtest UTA: Test for isEmpty()
     *
     * @see examples.queue.Queue#isEmpty()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testIsEmpty() throws Throwable
    {
        // Given
        Queue underTest = new Queue();

        // When
        boolean result = underTest.isEmpty();

        // Then - assertions for result of method isEmpty()
        assertTrue(result);

    }

    /**
     * Parasoft Jtest UTA: Test for removeAll()
     *
     * @see examples.queue.Queue#removeAll()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testRemoveAll() throws Throwable
    {
        // Given
        Queue underTest = new Queue();

        // When
        underTest.removeAll();

    }

    /**
     * Parasoft Jtest UTA: Test for toString()
     *
     * @see examples.queue.Queue#toString()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testToString() throws Throwable
    {
        // Given
        Queue underTest = new Queue();

        // When
        String result = underTest.toString();

        // Then - assertions for result of method toString()
        assertEquals("Queue[]", result);

    }
}
