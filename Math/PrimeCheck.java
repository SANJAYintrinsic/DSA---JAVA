import java.util.*;

public class Main {
    public static void sieve(int n, int num) {

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        if (prime[num]) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }

    public static void main(String[] args) {
        sieve(50, 37);
    }
}
