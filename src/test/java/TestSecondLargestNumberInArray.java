import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.*;


public class TestSecondLargestNumberInArray {
    private List<Integer> integers= new ArrayList<>();
    private int expect;
    private LastTaskSecondLargerNumber largerNumber;
    @Before
    public void setP(){
        expect = 5;

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        largerNumber = new LastTaskSecondLargerNumber(integers);
    }

    @Test
    public void testLastTask(){

        Assert.assertEquals(expect,largerNumber.secondLargestNumber());
    }
}
