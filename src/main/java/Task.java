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
    public int getGreatestCommonDivisorFourValues(int a, int b, int c, int d){
        if (b == 0 || c == 0 || d == 0){
            return a;
        } else if ( c == 0 || d == 0|| a == 0) {
            return b;
        }else if ( d == 0 || a == 0 || b == 0) {
            return c;
        }else if ( a == 0 || b == 0 || c == 0) {
            return d;
        }
        return getGreatestCommonDivisorFourValues(b,a%b,a%c,a%d);
    }
}
