package SwallowSpeeds;

import Utility.MyArrays;
import Utility.Util;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * s is a valid Scanner and in particular
     * it is not null
     * @param s
     * @return return an array of double
     */
    public static double [] loadspeeds(Scanner s) {

        double [] speeds = new double[18];
        int i = 0;

        while (s.hasNextLine()) {
            String line = s.nextLine();

            if (line.indexOf('#') == -1 &&
                !line.isBlank()) {
                //System.out.println(line);
                speeds[i] = Double.parseDouble(line);
                i++;
            }
        }
        return speeds;
    }



    public static void main(String[] args) {
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";
        Scanner s = Util.openSite(path);
        double [] vec = loadspeeds(s);
        System.out.println(Arrays.toString(vec));
        MyArrays.printdoubles(vec);

        System.out.println(MyArrays.mean(vec) == 10.311111111111112);
        System.out.println(MyArrays.max(vec) == 12.1);
        System.out.println(MyArrays.median(vec));
        System.out.println(
            MyArrays.median(new double [] {1,2,3}) == 2 );
        System.out.println(
            MyArrays.median(new double [] {1,2,3,4}) == 2.5 );
        MyArrays.printdoubles(vec);
    }
}
