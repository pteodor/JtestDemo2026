package examples.flowanalysis.np;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Parasoft Jtest UTA: Test class for MessageFormatter
 *
 * @see examples.flowanalysis.np.MessageFormatter
 * @author pteodor
 */
public class MessageFormatterTest
{

    /**
     * Parasoft Jtest UTA: Test for printMessage(DatabaseObject)
     *
     * @see examples.flowanalysis.np.MessageFormatter#printMessage(DatabaseObject)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testPrintMessage() throws Throwable
    {
        // When
        DatabaseObject obj = mock(DatabaseObject.class);
        String getClassNameResult = "getClassNameResult"; // UTA: default value
        when(obj.getClassName()).thenReturn(getClassNameResult);

        Object getOIDResult = new Object(); // UTA: default value
        when(obj.getOID()).thenReturn(getOIDResult);
        MessageFormatter.printMessage(obj);

    }

}
