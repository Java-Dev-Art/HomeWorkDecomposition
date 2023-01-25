import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(value = Parameterized.class)
public class TestTaskDecompasion {
    private final int expected;
    private final int firstValue;
    private final int secondValue;


    @Parameterized.Parameters
    public static Collection<Object[]> setOfParameters(){
        return Arrays.asList(new Object[][]{
                {4,28,16},
                {6,24,18},
                {3,12,9}
        });
    }

    public TestTaskDecompasion(int expected, int firstValue, int secondValue) {
        this.expected = expected;
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
    @Test
    public void setTestGreatestCommonDivisor(){
        Task task = new Task();
        assertEquals(expected,task.getGreatestCommonDivisor(firstValue,secondValue));
    }
}
