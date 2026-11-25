package examples.flowanalysis;

import org.junit.Test;

import static org.junit.Assert.assertNull;
/**
 * Parasoft Jtest UTA: Test class for AlwaysCloseRAFs
 *
 * @see examples.flowanalysis.AlwaysCloseRAFs
 * @author pteodor
 */
public class AlwaysCloseRAFsTest
{

    /**
     * Parasoft Jtest UTA: Test for read(String, String, int)
     *
     * @see examples.flowanalysis.AlwaysCloseRAFs#read(String, String, int)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testRead() throws Throwable
    {
        // Given
        AlwaysCloseRAFs underTest = new AlwaysCloseRAFs();

        // When
        String sFileName = "sFileName"; // UTA: default value
        String sMode = "sMode"; // UTA: default value
        int offset = 1; // UTA: default value
        String result = underTest.read(sFileName, sMode, offset);

        // Then - assertions for result of method read(String, String, int)
        assertNull(result);

    }

    /**
     * Parasoft Jtest UTA: Test for readClose(String, String, int)
     *
     * @see examples.flowanalysis.AlwaysCloseRAFs#readClose(String, String, int)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testReadClose() throws Throwable
    {
        // Given
        AlwaysCloseRAFs underTest = new AlwaysCloseRAFs();

        // When
        String sFileName = "sFileName"; // UTA: default value
        String sMode = "sMode"; // UTA: default value
        int offset = 1; // UTA: default value
        String result = underTest.readClose(sFileName, sMode, offset);

        // Then - assertions for result of method readClose(String, String, int)
        assertNull(result);

    }
}
