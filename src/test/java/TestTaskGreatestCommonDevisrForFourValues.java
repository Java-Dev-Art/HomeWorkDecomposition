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
    public static Collection<Object[]> setValue() {
        return Arrays.asList(new Object[][]{
                {12, 12, 24, 36, 48},
                {2, 20, 60, 78, 100},
                {1, 5, 30, 78, 100},
                {5, 50, 25, 10, 60},
                {1, 3, 8, 10, 34},
                {1, 8, 8, 10, 5},
                {1, 4, 45, 10, 55}

        });
    }

    @Test
    public void testGCDFourValue() {
        Task task = new Task();
        Assert.assertEquals(expect, task.getGreatestCommonDivisorFourValues(firstValue, secondValue, theerdValue, fourthValue));
    }
}
