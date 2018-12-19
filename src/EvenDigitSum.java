public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int evenNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            if (remainder % 2 == 0) {
                evenNumber += remainder;
            }
            number /= 10;
        }
        return evenNumber;
    }
}
