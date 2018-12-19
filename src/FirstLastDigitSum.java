public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {


        int lastDigit = number % 10;

        int reverse = 0;

        int num = number;

        while (number != 0) {

            reverse = reverse * 10 + number % 10;

            number = number / 10;

        }


        int firstDigit = reverse % 10;

        int sum = firstDigit + lastDigit;


        if (num < 0) {

            return -1;

        }

        return sum;


    }
}
