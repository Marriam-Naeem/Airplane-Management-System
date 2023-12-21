package out.production.airlaib.test;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import out.production.airlaib.cancels;

/**
 * JUnit test class for the {@cancels} class.
 * Author: Marriam Naeem
 */
public class CancelsTest {

    private Connection mockConnection;
    private PreparedStatement mockPreparedStatement;
    private ResultSet mockResultSet;

    /**
     * Set up the mock database connection, statement, and result set.
     * @throws SQLException If a SQL exception occurs during setup.
     */
    @Before
    public void setUp() throws SQLException {
        // Mock the database connection, statement, and result set
        mockConnection = mock(Connection.class);
        mockPreparedStatement = mock(PreparedStatement.class);
        mockResultSet = mock(ResultSet.class);

        when(mockConnection.prepareStatement(any(String.class))).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);

        // Set up the mock result set to return a record when queried
        when(mockResultSet.next()).thenReturn(true);
    }

    /**
     * Close the mock connection after each test.
     * @throws SQLException If a SQL exception occurs during teardown.
     */
    @After
    public void tearDown() throws SQLException {
        // Close the mock connection after each test
        if (mockConnection != null) {
            mockConnection.close();
        }
    }

    /**
     * Test the {@code proceedBtnAction} method when a record is found.
     * Verifies that the proceed button is disabled and the success message is set.
     * @throws SQLException If a SQL exception occurs during the test.
     */
    @Test
    public void testProceedBtnActionRecordFound() throws SQLException {
        // Arrange
        cancels cancels = new cancels();
        cancels.setConnection(mockConnection);
        cancels.getIdTextField().setText("TO001");

        // Act
        cancels.proceedBtnAction(null);

        // Assert
        // Add your assertions based on the expected behavior
        // For example, check if the proceed button is disabled and a message is set
        assertEquals(false, cancels.getProceedBtn().isEnabled());
        assertEquals("RECORD DELETED SUCCESSFULLY", cancels.getBackgroundAdjustLabel1().getText());
    }

    /**
     * Test the {@code proceedBtnAction} method when a record is not found.
     * Verifies that the expected error message is shown using JOptionPane.
     * @throws SQLException If a SQL exception occurs during the test.
     */
    @Test
    public void testProceedBtnActionRecordNotFound() throws SQLException {
        // Arrange
        cancels cancels = new cancels();
        cancels.setConnection(mockConnection);
        cancels.getIdTextField().setText("nonexistentID");

        // Mock JOptionPane.showMessageDialog
        ArgumentCaptor<Object> messageCaptor = ArgumentCaptor.forClass(Object.class);
        Mockito.mockStatic(JOptionPane.class);
        // Capture the argument passed to showMessageDialog
        doNothing().when(JOptionPane.class);
        JOptionPane.showMessageDialog(eq(null), messageCaptor.capture());
        // Act
        cancels.proceedBtnAction(null);

        // Assert
        // Verify that showMessageDialog was called
        assertEquals("Record not Found", cancels.getShowMessageDialogMessage());

    }   
}