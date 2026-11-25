package examples.flowanalysis.np;

import java.util.Dictionary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Parasoft Jtest UTA: Test class for MyDictionary
 *
 * @see examples.flowanalysis.np.MyDictionary
 * @author pteodor
 */
public class MyDictionaryTest
{

    /**
     * Parasoft Jtest UTA: Test for getFromDictionary(Object)
     *
     * @see examples.flowanalysis.np.MyDictionary#getFromDictionary(Object)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testGetFromDictionary() throws Throwable
    {
        // Given
        MyDictionary underTest = new MyDictionary();
        Dictionary dictValue = mock(Dictionary.class);
        String getResult = "getResult"; // UTA: default value
        when(dictValue.get(nullable(Object.class))).thenReturn(getResult);
        underTest.dict = dictValue;

        // When
        Object key = new Object(); // UTA: default value
        String result = underTest.getFromDictionary(key);

        // Then - assertions for result of method getFromDictionary(Object)
        assertEquals("getResult", result);

        // Then - assertions for this instance of MyDictionary
        assertNotNull(underTest.dict);

    }

    /**
     * Parasoft Jtest UTA: Test for putToDictionary(Object, Object)
     *
     * @see examples.flowanalysis.np.MyDictionary#putToDictionary(Object, Object)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testPutToDictionary() throws Throwable
    {
        // Given
        MyDictionary underTest = new MyDictionary();
        Dictionary dictValue = mock(Dictionary.class);
        underTest.dict = dictValue;

        // When
        String key = "key"; // UTA: default value
        Object value = new Object(); // UTA: default value
        underTest.putToDictionary(key, value);

        // Then - assertions for this instance of MyDictionary
        assertNotNull(underTest.dict);

    }

}
