import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastTaskSecondLargerNumber {
    private List<Integer> integers = new ArrayList<>();

    public LastTaskSecondLargerNumber(List<Integer> integers) {
        this.integers = integers;
    }

    public int secondLargestNumber() {
        int secondLargest = integers.get(0);
        for (int i : integers) {
            if (i > secondLargest) ;
            {
                secondLargest = i - 1;
            }
        }
        print(secondLargest);
        return secondLargest;
    }

    public void print(int number) {
        System.out.println(number);
    }
}
