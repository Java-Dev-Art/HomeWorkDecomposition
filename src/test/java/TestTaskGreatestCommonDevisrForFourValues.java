import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@RunWith(value = Parameterized.class)
public class TestTaskGreatestCommonDevisrForFourValues {
    private final int expect;
    private final int firstValue;
    private final int secondValue;
    private final int theerdValue;
    private final int fourthValue;

    public TestTaskGreatestCommonDevisrForFourValues(int expect, int firstValue, int secondValue, int theerdValue, int fourthValue) {
        this.expect = expect;
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.theerdValue = theerdValue;
        this.fourthValue = fourthValue;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> setValue(){
        return Arrays.asList(new Object[][]{
                {6,12,24,36,48}
        });
    }

    @Test
    public void testGCDFourValue(){
        Task task = new Task();
        Assert.assertEquals(expect,task.getGreatestCommonDivisorFourValues(firstValue,secondValue,theerdValue,fourthValue));
    }
}
