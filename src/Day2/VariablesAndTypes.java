package Day2;

import Utility.Util;

public class VariablesAndTypes {




    // main is the name of a function
    // void is the return type
    public static void main(String[] args) {
        // cast the double 1e9 to an integer
        System.out.println(Util.investment(1,1.0,1,(int) 1e12));
        System.out.println(Util.investment(1,1.0,1,(int) 1e9));
        System.out.println(Util.f2c(212));

        int x = 7;
        System.out.println(x*x);
        x = 8;

        float e = 2.7182F;  // don't use floats
        double pi = 3.14159; // double precision

        //double electron_mass =
        // .00000000000000000000000000000091093837105;
        final double electron_mass = 9.109e-31;
        // electron_mass = 78;   error

        // Avagadro's number
        final double avagadros_number = 6.022e23;
    }
}
