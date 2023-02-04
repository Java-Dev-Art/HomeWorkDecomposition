import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestTaskLeastCommonMultipleOfTwoValue {
    private final int expect;
    private final int valueFirst;
    private final int valueSecond;

    public TestTaskLeastCommonMultipleOfTwoValue(int expect, int valueFirst, int valueSecond) {
        this.expect = expect;
        this.valueFirst = valueFirst;
        this.valueSecond = valueSecond;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> setParameters() {
        return Arrays.asList(new Object[][]{
                {36, 9, 12},
                {2322, 54, 86},
                {48, 12, 16},
                {160, 40, 32},
                {490, 98, 35},
                {4592, 112, 82}
        });
    }

    @Test
    public void testLestCommonMultiple() {
        Task task = new Task();
        Assert.assertEquals(expect, task.getLeastCommonMultiple(valueFirst, valueSecond));
    }
}
