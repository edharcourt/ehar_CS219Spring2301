package Utility;

public class Util {

    /**
     *
     * @param t - temperature in F
     * @param v - velocity in MPH
     * @return The windchill temperature
     */
    public static double windchill(
            double t, double v) {

        return 35.74 + 0.6215 * t +
               (0.4275*t - 35.75) * Math.pow(v,0.16);
    }

    public static double f2c(double f) {
        return 5/9.0*(f - 32);
    }

    /**
     *
     * @param c - initial investment
     * @param r - yearly rate .01 is 1%
     * @param t - number of years
     * @param n - number of times to compound per year
     * @return The final value of the investment
     */
    public static double investment(double c,
                                    double r,
                                    double t,
                                    int n) {
        return c*Math.pow(1+r/n, t*n);
    }

}
