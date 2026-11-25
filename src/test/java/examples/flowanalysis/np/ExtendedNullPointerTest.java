package examples.flowanalysis.np;

import java.util.Locale;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Parasoft Jtest UTA: Test class for ExtendedNullPointer
 *
 * @see examples.flowanalysis.np.ExtendedNullPointer
 * @author pteodor
 */
public class ExtendedNullPointerTest
{

    /**
     * Parasoft Jtest UTA: Test for getCountry(String, boolean)
     *
     * @see examples.flowanalysis.np.ExtendedNullPointer#getCountry(String, boolean)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testGetCountry() throws Throwable
    {
        // Given
        ExtendedNullPointer underTest = new ExtendedNullPointer();
        Map supportedLocalesMapValue = mock(Map.class);
        Locale getResult = Locale.getDefault(); // UTA: default value
        when(supportedLocalesMapValue.get(nullable(Object.class))).thenReturn(getResult);
        underTest.supportedLocalesMap = supportedLocalesMapValue;

        // When
        String languageId = "languageId"; // UTA: default value
        boolean bDisplayName = true; // UTA: configured value
        String result = underTest.getCountry(languageId, bDisplayName);

        // Then - assertions for result of method getCountry(String, boolean)
        assertEquals("Polska", result);

        // Then - assertions for this instance of ExtendedNullPointer
        assertEquals("", underTest.sFileName);
        assertNotNull(underTest.supportedLocalesMap);

    }

    /**
     * Parasoft Jtest UTA: Test for getCountry(String, boolean)
     *
     * @see examples.flowanalysis.np.ExtendedNullPointer#getCountry(String, boolean)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testGetCountry2() throws Throwable
    {
        // Given
        ExtendedNullPointer underTest = new ExtendedNullPointer();
        Map supportedLocalesMapValue = mock(Map.class);
        Locale getResult = Locale.getDefault(); // UTA: default value
        when(supportedLocalesMapValue.get(nullable(Object.class))).thenReturn(getResult);
        underTest.supportedLocalesMap = supportedLocalesMapValue;

        // When
        String languageId = "languageId"; // UTA: default value
        boolean bDisplayName = false; // UTA: configured value
        String result = underTest.getCountry(languageId, bDisplayName);

        // Then - assertions for result of method getCountry(String, boolean)
        assertEquals("PL", result);

        // Then - assertions for this instance of ExtendedNullPointer
        assertEquals("", underTest.sFileName);
        assertNotNull(underTest.supportedLocalesMap);

    }

}
