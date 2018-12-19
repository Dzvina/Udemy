public class NumberToWords {

    public static void numberToWords(int number) {
        int myDigit = getDigitCount(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            number = reverse(number);
            int myCompairDigit = getDigitCount(number);
            int singleNumber;
            while (number != 0) {
                singleNumber = number % 10;
                number /= 10;
                switch (singleNumber) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
            while (myDigit != myCompairDigit) {
                System.out.println("Zero");
                myDigit--;
            }
        }
    }

    public static int reverse(int number) {
        int myReverseNumber = 0;
        while (number != 0) {
            int myDigit = number % 10;
            myReverseNumber = myReverseNumber * 10 + myDigit;
            number /= 10;
        }
        return myReverseNumber;
    }

    public static int getDigitCount(int number) {
        int myDigit = 0;
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        while (number != 0) {
            number /= 10;
            myDigit++;
        }
        return myDigit;
    }
}
