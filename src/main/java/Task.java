public class Task {
    public int getGreatestCommonDivisor(int a, int b){
        if (b == 0){
            return a;
        }
        return getGreatestCommonDivisor(b, a % b);
    }
    public int getLeastCommonMultiple(int a, int b){
        return a * b/getGreatestCommonDivisor(a,b);
    }

}
