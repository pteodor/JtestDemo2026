package examples.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Parasoft Jtest UTA: Test class for NaiveStringBuilder
 *
 * @see examples.junit.NaiveStringBuilder
 * @author pteodor
 */
public class NaiveStringBuilderTest
{

    /**
     * Parasoft Jtest UTA: Test for append(String)
     *
     * @see examples.junit.NaiveStringBuilder#append(String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testAppend() throws Throwable
    {
        // Given
        String value = "value"; // UTA: default value
        NaiveStringBuilder underTest = NaiveStringBuilder.createInstance(value);

        // When
        String sTitle = "sTitle"; // UTA: default value
        String result = underTest.append(sTitle);

        // Then - assertions for result of method append(String)
        assertEquals("valuesTitle", result);

    }

    /**
     * Parasoft Jtest UTA: Test for append(String)
     *
     * @see examples.junit.NaiveStringBuilder#append(String)
     * @author pteodor
     */
    @Test(timeout = 5000, expected = IllegalArgumentException.class)
    public void testAppend2() throws Throwable
    {
        // Given
        String value = "value"; // UTA: default value
        NaiveStringBuilder underTest = NaiveStringBuilder.createInstance(value);

        // When
        String sTitle = null; // UTA: configured value
        underTest.append(sTitle);

    }

}
