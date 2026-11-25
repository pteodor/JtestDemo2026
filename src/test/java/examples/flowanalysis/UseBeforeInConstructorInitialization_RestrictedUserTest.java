package examples.flowanalysis;

import org.junit.Test;

import examples.flowanalysis.UseBeforeInConstructorInitialization.RestrictedUser;

import static org.junit.Assert.assertEquals;
/**
 * Parasoft Jtest UTA: Test class for RestrictedUser
 *
 * @see examples.flowanalysis.UseBeforeInConstructorInitialization.RestrictedUser
 * @author pteodor
 */
public class UseBeforeInConstructorInitialization_RestrictedUserTest
{

    /**
     * Parasoft Jtest UTA: Test for checkData()
     *
     * @see examples.flowanalysis.UseBeforeInConstructorInitialization.RestrictedUser#checkData()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testCheckData() throws Throwable
    {
        // Given
        String name = "*"; // UTA: configured value
        String password = "password"; // UTA: default value
        RestrictedUser underTest = new RestrictedUser(name, password);
        String nameValue = ""; // UTA: configured value
        underTest.name = nameValue;
        underTest.minLoginLength = 0; // UTA: configured value

        // When
        underTest.checkData();

        // Then - assertions for this instance of UseBeforeInConstructorInitialization.RestrictedUser
        assertEquals("", underTest.name);
        assertEquals("password", underTest.password);
        assertEquals(0, underTest.minLoginLength);

    }

    /**
     * Parasoft Jtest UTA: Test for checkData()
     *
     * @see examples.flowanalysis.UseBeforeInConstructorInitialization.RestrictedUser#checkData()
     * @author pteodor
     */
    @Test(timeout = 5000, expected = IllegalArgumentException.class)
    public void testCheckData2() throws Throwable
    {
        // Given
        String name = "*"; // UTA: configured value
        String password = "password"; // UTA: default value
        RestrictedUser underTest = new RestrictedUser(name, password);
        String nameValue = ""; // UTA: configured value
        underTest.name = nameValue;
        underTest.minLoginLength = 1; // UTA: configured value

        // When
        underTest.checkData();

    }
}
