public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        double first = (int) (firstNumber * 1000);
        double second = (int) (secondNumber * 1000);

        if (first == second) {
            return true;
        } else {
            return false;
        }

    }
}
