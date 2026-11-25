package examples.flowanalysis;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Parasoft Jtest UTA: Test class for XMLInjection
 *
 * @see examples.flowanalysis.XMLInjection
 * @author pteodor
 */
public class XMLInjectionTest
{

    /**
     * Parasoft Jtest UTA: Test for createXMLDocumentAndStoreData(Document, String, String, String, String)
     *
     * @see examples.flowanalysis.XMLInjection#createXMLDocumentAndStoreData(Document, String, String, String, String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testCreateXMLDocumentAndStoreData() throws Throwable
    {
        // Given
        XMLInjection underTest = new XMLInjection();

        // When
        Document document = mock(Document.class);
        Element createElementResult = mock(Element.class);
        Element createElementResult2 = mock(Element.class);
        when(document.createElement(nullable(String.class))).thenReturn(createElementResult, createElementResult2);
        String sUserId = "sUserId"; // UTA: default value
        String sUserName = "sUserName"; // UTA: default value
        String sDataType = "sDataType"; // UTA: default value
        String sData = "sData"; // UTA: default value
        underTest.createXMLDocumentAndStoreData(document, sUserId, sUserName, sDataType, sData);

    }
}
