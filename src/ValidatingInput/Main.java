package ValidatingInput;

import Utility.Util;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            System.out.print("Enter a temp in F: ");

            // ask the user to enter some input
            // and check that it is a double
            if (kbd.hasNextDouble()) {
                double f = kbd.nextDouble();
                double c = Util.f2c(f);
                System.out.printf("%.1f\n", c);
                done = true;
            } else {
                System.out.println("Error: must enter a decimal value.");
                System.out.printf("You entered \"%s\".\n", kbd.nextLine());
            }
        }  // while

    }

}
