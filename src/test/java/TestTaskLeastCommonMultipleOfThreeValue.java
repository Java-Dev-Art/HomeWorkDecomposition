import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestTaskLeastCommonMultipleOfThreeValue {
    private final int expect;
    private final int firstNumber;
    private final int secondNumber;
    private final int thirdNumber;

    public TestTaskLeastCommonMultipleOfThreeValue(int expect, int firstNumber, int secondNumber, int thirdNumber) {
        this.expect = expect;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> setParameters() {
        return Arrays.asList(new Object[][]{
                {180, 4, 45, 10},
                {10, 2, 5, 10},
                {35700, 21, 51, 100},
                {120, 5, 6, 8},
                {1296, 4, 16, 81},
                {40, 5, 1, 8}
        });
    }

    @Test
    public void testLestCommonMultipleForThreeNumbers() {
        Task task = new Task();
        Assert.assertEquals(expect, task.getLeastCommonMultipleForThreeNumbers(firstNumber, secondNumber, thirdNumber));
    }
}
