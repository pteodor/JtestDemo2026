package examples.mock;

import java.nio.CharBuffer;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
/**
 * Parasoft Jtest UTA: Test class for MultiSourceCharacterReader
 *
 * @see examples.mock.MultiSourceCharacterReader
 * @author pteodor
 */
public class MultiSourceCharacterReaderTest
{

    /**
     * Parasoft Jtest UTA: Test for initialize()
     *
     * @see examples.mock.MultiSourceCharacterReader#initialize()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testInitialize() throws Throwable
    {
        // Given
        Readable readable = mock(Readable.class);
        MultiSourceCharacterReader underTest = new MultiSourceCharacterReader(readable);

        // When
        underTest.initialize();

        // Then - assertions for this instance of MultiSourceCharacterReader
        assertNull(underTest._readablePublic);

    }

    /**
     * Parasoft Jtest UTA: Test for performAction(CharBuffer)
     *
     * @see examples.mock.MultiSourceCharacterReader#performAction(CharBuffer)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testPerformAction() throws Throwable
    {
        // Given
        Readable readable = mock(Readable.class);
        MultiSourceCharacterReader underTest = new MultiSourceCharacterReader(readable);
        Readable _readablePublicValue = mock(Readable.class);
        underTest._readablePublic = _readablePublicValue;
        underTest.initialize();

        // When
        CharBuffer cb = mock(CharBuffer.class);
        underTest.performAction(cb);

        // Then - assertions for this instance of MultiSourceCharacterReader
        assertNotNull(underTest._readablePublic);

    }
}
