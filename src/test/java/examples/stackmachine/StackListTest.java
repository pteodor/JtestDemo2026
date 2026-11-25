package examples.stackmachine;

import java.lang.reflect.Field;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Parasoft Jtest UTA: Test class for StackList
 *
 * @see examples.stackmachine.StackList
 * @author pteodor
 */
public class StackListTest
{

    /**
     * Parasoft Jtest UTA: Helper method to set private field _currentStackModel
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
     * Parasoft Jtest UTA: Test for adjustScroll()
     *
     * @see examples.stackmachine.StackList#adjustScroll()
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testAdjustScroll() throws Throwable
    {
        // Given
        RunnableStackMachine machineGUI = mock(RunnableStackMachine.class);
        StackList underTest = new StackList(machineGUI);
        AbstractStackMachine _currentStackModelValue = mock(AbstractStackMachine.class);
        int getSizeResult = -1; // UTA: configured value
        when(_currentStackModelValue.getSize()).thenReturn(getSizeResult);
        setPrivateField(underTest, StackList.class, "_currentStackModel", _currentStackModelValue);

        // When
        underTest.adjustScroll();

    }

    /**
     * Parasoft Jtest UTA: Test for updateModel(boolean)
     *
     * @see examples.stackmachine.StackList#updateModel(boolean)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testUpdateModel() throws Throwable
    {
        // Given
        RunnableStackMachine machineGUI = mock(RunnableStackMachine.class);
        StackList underTest = new StackList(machineGUI);
        LifoStackMachine _lifoStackModelValue = mock(LifoStackMachine.class);
        setPrivateField(underTest, StackList.class, "_lifoStackModel", _lifoStackModelValue);

        // When
        boolean lifoModel = true; // UTA: configured value
        underTest.updateModel(lifoModel);

    }

    /**
     * Parasoft Jtest UTA: Test for updateModel(boolean)
     *
     * @see examples.stackmachine.StackList#updateModel(boolean)
     * @author pteodor
     */
    @Test(timeout = 5000)
    public void testUpdateModel2() throws Throwable
    {
        // Given
        RunnableStackMachine machineGUI = mock(RunnableStackMachine.class);
        StackList underTest = new StackList(machineGUI);
        FifoStackMachine _fifoStackModelValue = mock(FifoStackMachine.class);
        setPrivateField(underTest, StackList.class, "_fifoStackModel", _fifoStackModelValue);

        // When
        boolean lifoModel = false; // UTA: configured value
        underTest.updateModel(lifoModel);

    }

}
