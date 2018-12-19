public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        int max = 0;

        if ((first < 10) || (second < 10)) {
            return -1;
        } else {
            for (int i = 1; i <= first; i++) {
                for (int j = i; j <= second; j++) {
                    if ((first % i == 0) && (second % j == 0) && (i == j)) {
                        max = i;

                    }
                }

            }

        }

        return max;
    }
}
