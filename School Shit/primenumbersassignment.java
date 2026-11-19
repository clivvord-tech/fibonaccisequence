public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;          
        }
        if (n == 2) {
            return true;           
        }
        if (n % 2 == 0) {
            return false;          
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 500:");
        int count = 0;

        for (int i = 0; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n\nTotal primes found: " + count);
    }
}
