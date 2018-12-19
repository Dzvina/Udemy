public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {

        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        System.out.println("1. " + lastDigit1 + "\n2. " + lastDigit2);

        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {
            while (number1 > 0 || number2 > 0) {
                int firstDigit1 = number1;
                System.out.println(firstDigit1);
                int firstDigit2 = number2;
                System.out.println(firstDigit2);
                number1 /= 10;
                number2 /= 10;

                if ((firstDigit1 == firstDigit2) || (firstDigit1 == lastDigit2) || (lastDigit1 == firstDigit2) || (lastDigit1 == lastDigit2)) {
                    return true;
                }
            }
        }

        return false;
    }
}
