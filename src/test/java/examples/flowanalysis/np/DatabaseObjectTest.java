package examples.flowanalysis.np;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Parasoft Jtest UTA: Test class for DatabaseObject
 *
 * @see examples.flowanalysis.np.DatabaseObject
 * @author pteodor
 */
public class DatabaseObjectTest
{

    /**
     * Parasoft Jtest UTA: Test for getClassName()
     *
     * @see examples.flowanalysis.np.DatabaseObject#getClassName()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testGetClassName() throws Throwable
    {
        // Given
        DatabaseObject underTest = new DatabaseObject();

        // When
        String result = underTest.getClassName();

        // Then - assertions for result of method getClassName()
        assertEquals("examples.flowanalysis.np.DatabaseObject", result);

        // Then - assertions for this instance of DatabaseObject
        assertNull(underTest.oid);

    }

    /**
     * Parasoft Jtest UTA: Test for getOID()
     *
     * @see examples.flowanalysis.np.DatabaseObject#getOID()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testGetOID() throws Throwable
    {
        // Given
        DatabaseObject underTest = new DatabaseObject();

        // When
        Object result = underTest.getOID();

        // Then - assertions for result of method getOID()
        assertNull(result);

        // Then - assertions for this instance of DatabaseObject
        assertNull(underTest.oid);

    }

    /**
     * Parasoft Jtest UTA: Test for getObjectFromDatabase(Connection, String, String)
     *
     * @see examples.flowanalysis.np.DatabaseObject#getObjectFromDatabase(Connection, String, String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testGetObjectFromDatabase() throws Throwable
    {
        // When
        Connection sqlConnection = mock(Connection.class);
        Statement createStatementResult = mock(Statement.class);
        ResultSet executeQueryResult = mock(ResultSet.class);
        String getStringResult = "getStringResult"; // UTA: default value
        when(executeQueryResult.getString(nullable(String.class))).thenReturn(getStringResult);

        boolean nextResult = true; // UTA: configured value
        when(executeQueryResult.next()).thenReturn(nextResult);
        when(createStatementResult.executeQuery(nullable(String.class))).thenReturn(executeQueryResult);
        when(sqlConnection.createStatement()).thenReturn(createStatementResult);
        String table = "table"; // UTA: default value
        String id = "id"; // UTA: default value
        DatabaseObject result = DatabaseObject.getObjectFromDatabase(sqlConnection, table, id);

        // Then - assertions for result of method getObjectFromDatabase(Connection, String, String)
        assertNotNull(result);
        assertEquals("getStringResult", result.oid);

    }

    /**
     * Parasoft Jtest UTA: Test for getObjectFromDatabase(Connection, String, String)
     *
     * @see examples.flowanalysis.np.DatabaseObject#getObjectFromDatabase(Connection, String, String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testGetObjectFromDatabase2() throws Throwable
    {
        // When
        Connection sqlConnection = mock(Connection.class);
        Statement createStatementResult = mock(Statement.class);
        ResultSet executeQueryResult = mock(ResultSet.class);
        doThrow(SQLException.class).when(executeQueryResult).close();

        String getStringResult = "getStringResult"; // UTA: default value
        when(executeQueryResult.getString(nullable(String.class))).thenReturn(getStringResult);

        boolean nextResult = true; // UTA: configured value
        when(executeQueryResult.next()).thenReturn(nextResult);
        when(createStatementResult.executeQuery(nullable(String.class))).thenReturn(executeQueryResult);
        when(sqlConnection.createStatement()).thenReturn(createStatementResult);
        String table = "table"; // UTA: default value
        String id = "id"; // UTA: default value
        DatabaseObject result = DatabaseObject.getObjectFromDatabase(sqlConnection, table, id);

        // Then - assertions for result of method getObjectFromDatabase(Connection, String, String)
        assertNotNull(result);
        assertEquals("getStringResult", result.oid);

    }

    /**
     * Parasoft Jtest UTA: Test for getObjectFromDatabase(Connection, String, String)
     *
     * @see examples.flowanalysis.np.DatabaseObject#getObjectFromDatabase(Connection, String, String)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testGetObjectFromDatabase3() throws Throwable
    {
        // When
        Connection sqlConnection = mock(Connection.class);
        Statement createStatementResult = mock(Statement.class);
        doThrow(SQLException.class).when(createStatementResult).close();

        ResultSet executeQueryResult = mock(ResultSet.class);
        String getStringResult = "getStringResult"; // UTA: default value
        when(executeQueryResult.getString(nullable(String.class))).thenReturn(getStringResult);

        boolean nextResult = true; // UTA: configured value
        when(executeQueryResult.next()).thenReturn(nextResult);
        when(createStatementResult.executeQuery(nullable(String.class))).thenReturn(executeQueryResult);
        when(sqlConnection.createStatement()).thenReturn(createStatementResult);
        String table = "table"; // UTA: default value
        String id = "id"; // UTA: default value
        DatabaseObject result = DatabaseObject.getObjectFromDatabase(sqlConnection, table, id);

        // Then - assertions for result of method getObjectFromDatabase(Connection, String, String)
        assertNotNull(result);
        assertEquals("getStringResult", result.oid);

    }

}
