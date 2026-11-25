package examples.flowanalysis;

import java.util.logging.Level;

import org.junit.Test;

import static org.mockito.Mockito.mock;
/**
 * Parasoft Jtest UTA: Test class for AlwaysCloseLogging
 *
 * @see examples.flowanalysis.AlwaysCloseLogging
 * @author pteodor
 */
public class AlwaysCloseLoggingTest
{

    /**
     * Parasoft Jtest UTA: Test for log(Level, String)
     *
     * @see examples.flowanalysis.AlwaysCloseLogging#log(Level, String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testLog() throws Throwable
    {
        // Given
        AlwaysCloseLogging underTest = new AlwaysCloseLogging();

        // When
        Level level = mock(Level.class);
        String message = "message"; // UTA: default value
        underTest.log(level, message);

    }

    /**
     * Parasoft Jtest UTA: Test for logClose(Level, String)
     *
     * @see examples.flowanalysis.AlwaysCloseLogging#logClose(Level, String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testLogClose() throws Throwable
    {
        // Given
        AlwaysCloseLogging underTest = new AlwaysCloseLogging();

        // When
        Level level = mock(Level.class);
        String message = "message"; // UTA: default value
        underTest.logClose(level, message);

    }
}
