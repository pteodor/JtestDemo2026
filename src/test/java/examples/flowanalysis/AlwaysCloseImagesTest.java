package examples.flowanalysis;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageReader;
import javax.imageio.spi.ImageReaderSpi;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Parasoft Jtest UTA: Test class for AlwaysCloseImages
 *
 * @see examples.flowanalysis.AlwaysCloseImages
 * @author pteodor
 */
public class AlwaysCloseImagesTest
{

    /**
     * Parasoft Jtest UTA: Test for readImage(ImageReaderSpi)
     *
     * @see examples.flowanalysis.AlwaysCloseImages#readImage(ImageReaderSpi)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testReadImage() throws Throwable
    {
        // Given
        AlwaysCloseImages underTest = new AlwaysCloseImages();

        // When
        ImageReaderSpi spi = mock(ImageReaderSpi.class);
        ImageReader createReaderInstanceResult = mock(ImageReader.class);
        when(spi.createReaderInstance()).thenReturn(createReaderInstanceResult);
        Image result = underTest.readImage(spi);

        // Then - assertions for result of method readImage(ImageReaderSpi)
        assertNull(result);

    }

    /**
     * Parasoft Jtest UTA: Test for readImage(ImageReaderSpi)
     *
     * @see examples.flowanalysis.AlwaysCloseImages#readImage(ImageReaderSpi)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testReadImage2() throws Throwable
    {
        // Given
        AlwaysCloseImages underTest = new AlwaysCloseImages();

        // When
        ImageReaderSpi spi = mock(ImageReaderSpi.class);
        when(spi.createReaderInstance()).thenThrow(IOException.class);
        Image result = underTest.readImage(spi);

        // Then - assertions for result of method readImage(ImageReaderSpi)
        assertNull(result);

    }

    /**
     * Parasoft Jtest UTA: Test for readImageClose(ImageReaderSpi)
     *
     * @see examples.flowanalysis.AlwaysCloseImages#readImageClose(ImageReaderSpi)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testReadImageClose() throws Throwable
    {
        // Given
        AlwaysCloseImages underTest = new AlwaysCloseImages();

        // When
        ImageReaderSpi spi = mock(ImageReaderSpi.class);
        ImageReader createReaderInstanceResult = mock(ImageReader.class);
        when(spi.createReaderInstance()).thenReturn(createReaderInstanceResult);
        Image result = underTest.readImageClose(spi);

        // Then - assertions for result of method readImageClose(ImageReaderSpi)
        assertNull(result);

    }

    /**
     * Parasoft Jtest UTA: Test for readImageClose(ImageReaderSpi)
     *
     * @see examples.flowanalysis.AlwaysCloseImages#readImageClose(ImageReaderSpi)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testReadImageClose2() throws Throwable
    {
        // Given
        AlwaysCloseImages underTest = new AlwaysCloseImages();

        // When
        ImageReaderSpi spi = mock(ImageReaderSpi.class);
        ImageReader createReaderInstanceResult = mock(ImageReader.class);
        when(createReaderInstanceResult.read(anyInt())).thenThrow(IOException.class);
        when(spi.createReaderInstance()).thenReturn(createReaderInstanceResult);
        Image result = underTest.readImageClose(spi);

        // Then - assertions for result of method readImageClose(ImageReaderSpi)
        assertNull(result);

    }

}
