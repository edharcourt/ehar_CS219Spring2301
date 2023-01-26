package Day3;

import Utility.Util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a temp (F): ");
        double temp = kbd.nextDouble();
        System.out.print("Enter a velocity (MPH): ");
        double vel = kbd.nextDouble();
        System.out.println(
           Util.windchill(temp,vel));

        // formatted print
        System.out.printf(
          "Windchill is %.1f degrees F.\n",
          Util.windchill(temp,vel));
    }
}
