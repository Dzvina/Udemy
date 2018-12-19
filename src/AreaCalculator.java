public class AreaCalculator {

    public static double area(double radius) {
        final double MYPI = 3.14159;
        if (radius < 0) {
            return -1.0;
        }

        double areaCircle = (radius * radius) * MYPI;
        return areaCircle;

    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        double areaRectangle = x * y;
        return areaRectangle;
    }
}
