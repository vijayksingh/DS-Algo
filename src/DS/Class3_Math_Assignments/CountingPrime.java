package DS.Class3_Math_Assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingPrime {
    static int SieveOfErastosis(int n) {
        List<Boolean> primes = Arrays.asList(new Boolean[n]);
        Collections.fill(primes, Boolean.TRUE);

        if (n <= 2) return 0;

        for (int i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
            for (int j = 2; j*i <= n; j++) {
                primes.set(j*i, Boolean.FALSE);
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if(primes.get(i) == Boolean.TRUE) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SieveOfErastosis(2);
    }
}
