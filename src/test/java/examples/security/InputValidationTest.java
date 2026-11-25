package examples.security;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Parasoft Jtest UTA: Test class for InputValidation
 *
 * @see examples.security.InputValidation
 * @author pteodor
 */
public class InputValidationTest
{

    /**
     * Parasoft Jtest UTA: Test for doGet(HttpServletRequest, HttpServletResponse)
     *
     * @see examples.security.InputValidation#doGet(HttpServletRequest, HttpServletResponse)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testDoGet() throws Throwable
    {
        // Given
        InputValidation underTest = new InputValidation();
        Connection _connectionValue = mock(Connection.class);
        Statement createStatementResult = mock(Statement.class);
        ResultSet executeQueryResult = mock(ResultSet.class);
        boolean nextResult = true; // UTA: configured value
        when(executeQueryResult.next()).thenReturn(nextResult);
        when(createStatementResult.executeQuery(nullable(String.class))).thenReturn(executeQueryResult);
        when(_connectionValue.createStatement()).thenReturn(createStatementResult);
        setPrivateField(underTest, InputValidation.class, "_connection", _connectionValue);

        // When
        HttpServletRequest request = mock(HttpServletRequest.class);
        String getParameterResult = "getParameterResult"; // UTA: default value
        String getParameterResult2 = "getParameterResult2"; // UTA: default value
        when(request.getParameter(nullable(String.class))).thenReturn(getParameterResult, getParameterResult2);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream getOutputStreamResult = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(getOutputStreamResult);
        underTest.doGet(request, response);

    }

    /**
     * Parasoft Jtest UTA: Helper method to set private field _connection
     */
    private static <T> void setPrivateField(Object object, Class<?> fieldClass, String fieldName, T value)
    {
        try {
            Field field = fieldClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(object, value);
        } catch (NoSuchFieldException e) {
            throw (AssertionError) new AssertionError("No such field found").initCause(e);
        } catch (IllegalAccessException e) {
            throw (AssertionError) new AssertionError("Unable to access the specified private field").initCause(e);
        } catch (SecurityException e) {
            throw (AssertionError) new AssertionError("There was a security exception when attempting to access a private field").initCause(e);
        }
    }

    /**
     * Parasoft Jtest UTA: Test for doGet(HttpServletRequest, HttpServletResponse)
     *
     * @see examples.security.InputValidation#doGet(HttpServletRequest, HttpServletResponse)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testDoGet2() throws Throwable
    {
        // Given
        InputValidation underTest = new InputValidation();
        Connection _connectionValue = mock(Connection.class);
        Statement createStatementResult = mock(Statement.class);
        ResultSet executeQueryResult = mock(ResultSet.class);
        boolean nextResult = false; // UTA: configured value
        when(executeQueryResult.next()).thenReturn(nextResult);
        when(createStatementResult.executeQuery(nullable(String.class))).thenReturn(executeQueryResult);
        when(_connectionValue.createStatement()).thenReturn(createStatementResult);
        setPrivateField(underTest, InputValidation.class, "_connection", _connectionValue);

        // When
        HttpServletRequest request = mock(HttpServletRequest.class);
        String getParameterResult = "getParameterResult"; // UTA: default value
        String getParameterResult2 = "getParameterResult2"; // UTA: default value
        when(request.getParameter(nullable(String.class))).thenReturn(getParameterResult, getParameterResult2);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream getOutputStreamResult = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(getOutputStreamResult);
        underTest.doGet(request, response);

    }

    /**
     * Parasoft Jtest UTA: Test for doGet(HttpServletRequest, HttpServletResponse)
     *
     * @see examples.security.InputValidation#doGet(HttpServletRequest, HttpServletResponse)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testDoGet3() throws Throwable
    {
        // Given
        InputValidation underTest = new InputValidation();
        Connection _connectionValue = mock(Connection.class);
        when(_connectionValue.createStatement()).thenThrow(SQLException.class);
        setPrivateField(underTest, InputValidation.class, "_connection", _connectionValue);

        // When
        HttpServletRequest request = mock(HttpServletRequest.class);
        String getParameterResult = "getParameterResult"; // UTA: default value
        String getParameterResult2 = "getParameterResult2"; // UTA: default value
        when(request.getParameter(nullable(String.class))).thenReturn(getParameterResult, getParameterResult2);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream getOutputStreamResult = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(getOutputStreamResult);
        underTest.doGet(request, response);

    }

    /**
     * Parasoft Jtest UTA: Test for logInvalidLogin(String, String)
     *
     * @see examples.security.InputValidation#logInvalidLogin(String, String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testLogInvalidLogin() throws Throwable
    {
        // Given
        InputValidation underTest = new InputValidation();
        Connection _connectionValue = mock(Connection.class);
        Statement createStatementResult = mock(Statement.class);
        when(_connectionValue.createStatement()).thenReturn(createStatementResult);
        setPrivateField(underTest, InputValidation.class, "_connection", _connectionValue);

        // When
        String username = "username"; // UTA: default value
        String password = "password"; // UTA: default value
        underTest.logInvalidLogin(username, password);

    }

    /**
     * Parasoft Jtest UTA: Test for logInvalidLogin(String, String)
     *
     * @see examples.security.InputValidation#logInvalidLogin(String, String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testLogInvalidLogin2() throws Throwable
    {
        // Given
        InputValidation underTest = new InputValidation();
        Connection _connectionValue = mock(Connection.class);
        when(_connectionValue.createStatement()).thenThrow(SQLException.class);
        setPrivateField(underTest, InputValidation.class, "_connection", _connectionValue);

        // When
        String username = "username"; // UTA: default value
        String password = "password"; // UTA: default value
        underTest.logInvalidLogin(username, password);

    }

    /**
     * Parasoft Jtest UTA: Test for validate(String)
     *
     * @see examples.security.InputValidation#validate(String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testValidate() throws Throwable
    {
        // When
        String username_or_password = ""; // UTA: configured value
        String result = InputValidation.validate(username_or_password);

        // Then - assertions for result of method validate(String)
        assertEquals("", result);

    }

    /**
     * Parasoft Jtest UTA: Test for validate(String)
     *
     * @see examples.security.InputValidation#validate(String)
     * @author pteodor
     */
    @Test(timeout = 5000, expected = IllegalArgumentException.class)
    public void testValidate2() throws Throwable
    {
        // When
        String username_or_password = "'"; // UTA: configured value
        InputValidation.validate(username_or_password);

    }
}
