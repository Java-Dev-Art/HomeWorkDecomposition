public class Task {
    public int getGreatestCommonDivisor(int a, int b){
        if (b == 0){
            return a;
        }
        return getGreatestCommonDivisor(b, a % b);
    }

}
