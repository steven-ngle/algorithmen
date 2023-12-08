import java.util.Arrays;

public class SiebDesEratosthenes {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Eratosthenes(10)));
    }

    private static boolean[] Eratosthenes(int num) {

        boolean[] isPrime = new boolean[num - 1];

        for (int i = 2; i < isPrime.length + 2; i++){
            for (int number = i; number < isPrime.length + 2; number++) {
                if (number % i == 0 && number != i) {
                    isPrime[number - 2] = true;
                }
            }
        }
        return isPrime;
    }
}
