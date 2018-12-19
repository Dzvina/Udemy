public class LargestPrime {

    public static int getLargestPrime(int number) {
        int prime = 0;
        int i = 2;

        if (number < 0 || number == 1 || number == 0) {
            return -1;
        } else {
            for (; number >= i; ) {
                if (number % i == 0) {
                    number /= i;
                    prime = i;
                    i = 2;

                } else i++;
            }
        }
        return prime;
    }
}
