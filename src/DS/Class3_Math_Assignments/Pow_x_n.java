package DS.Class3_Math_Assignments;

public class Pow_x_n {
    static double myPow(double x, int n) {
        int res = 0;
        if (n%2 != 0) res = 1;
        if (n == 1) return x;
        if (n == -1) return 1/x;

        if(n == 2) return x*x;
        if (n == -2) return 1/(x*x);
        if(n > 0) {
            return res == 1 ?
                myPow(x, n/2) * myPow(x, n/2) * myPow(x, 1) :
                myPow(x, n/2) * myPow(x, n/2);
        } return res == 1 ?
                myPow(x, n/2) * myPow(x, n/2) * myPow(x, -1) :
                myPow(x, n/2) * myPow(x, n/2);
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.1, 100));
    }
}
