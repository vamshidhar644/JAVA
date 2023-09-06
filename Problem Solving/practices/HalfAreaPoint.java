package practices;

public class HalfAreaPoint {
    public static void main(String[] args) {
        Curve curve = new Curve();

        double p = 37;

        double result = findHalfAreaPoint(curve, p);

        System.out.println(result);
    }

    static double findHalfAreaPoint(Curve curve, double p) {
        double epsilon = 0.001;
        double left = 0.0;
        double right = p;
        double mid;

        while (Math.abs(curve.areaUnderCurve(right) - curve.areaUnderCurve(left) - p) > epsilon) {
            mid = (left + right) / 2;
            double midArea = curve.areaUnderCurve(mid);

            if (midArea < (p / 2)) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return (left + right) / 2;
    }
}

class Curve {
    double areaUnderCurve(double x) {
        return 5 * x + 10;
    }
}
