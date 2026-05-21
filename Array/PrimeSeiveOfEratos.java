import java.util.*;
                                 // time - O(n log log n) 
                                 // space - O(n)
public class Main {
    public static void sieve(int n) {

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

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        sieve(50);
    }
}
