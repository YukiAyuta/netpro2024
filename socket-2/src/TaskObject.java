package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskObject implements ITask {
    public class PrimeChecker {
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            if (n <= 3) {
                return true;
            }

            // 2と3の倍数以外の奇数を確認
            if (n % 2 == 0 || n % 3 == 0) {
                return false;
            }

            // 6k ± 1の形の数のみを確認
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            int n = 17;
            if (isPrime(n)) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }

    public class SieveOfEratosthenes {
        public static List<Integer> findPrimes(int n) {
            boolean[] isPrime = new boolean[n + 1];
            Arrays.fill(isPrime, true);
            List<Integer> primes = new ArrayList<>();

            for (int p = 2; p * p <= n; p++) {
                if (isPrime[p]) {
                    for (int i = p * p; i <= n; i += p) {
                        isPrime[i] = false;
                    }
                }
            }

            for (int p = 2; p <= n; p++) {
                if (isPrime[p]) {
                    primes.add(p);
                }
            }

            return primes;
        }

        public static void main(String[] args) {
            int n = 100;
            List<Integer> primes = findPrimes(n);
            System.out.println("Prime numbers up to " + n + ": " + primes);
        }
    }
}
