public class Task {
    public int getGreatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGreatestCommonDivisor(b, a % b);
    }

    public int getLeastCommonMultiple(int a, int b) {
        return a * b / getGreatestCommonDivisor(a, b);
    }

    public int getGreatestCommonDivisorFourValues(int a, int b, int c, int d) {
        int firstPair = getGreatestCommonDivisor(a, b);
        int secondPair = getGreatestCommonDivisor(c, d);

        return getGreatestCommonDivisor(firstPair, secondPair);
    }

    public int getLeastCommonMultipleForThreeNumbers(int a, int b, int c) {
        int pair = getLeastCommonMultiple(a, b);
        return getLeastCommonMultiple(pair, c);
    }
    public int sumAllOddNumbers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i += 2) {
            sum += i;
        }
        return sum;
    }
}
