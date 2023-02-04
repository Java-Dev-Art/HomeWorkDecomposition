import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestToSumAllAddNumbers {
    private final int expect;
    private final int numberForExample;

    public TestToSumAllAddNumbers(int expect, int numberForExample) {
        this.expect = expect;
        this.numberForExample = numberForExample;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> setParameters(){
        return Arrays.asList(new Object[][]{
                {25,9}
        });
    }
    @Test
    public void testSumOddNumbers(){
        Task task = new Task();
        Assert.assertEquals(expect,task.sumAllOddNumbers(numberForExample));
    }
}
