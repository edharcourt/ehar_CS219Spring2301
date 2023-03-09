package Utility;

import java.util.Arrays;

public class MyArrays {

    public static double median(double [] array) {

        Arrays.sort(array);

        if (array.length % 2 == 1)
            return array[array.length / 2];
        else
            return (array[array.length/2] +
                   array[array.length/2 - 1]) / 2;
    }

    public static double min(double [] array) {

        double smallest = Double.POSITIVE_INFINITY;
        // smallest = array[0];

        for (double v : array)
            if (v < smallest)
                smallest = v;

        return smallest;
    }

    public static double max(double [] array) {

        double largest = Double.NEGATIVE_INFINITY;

        for (double v : array)
            if (v > largest)
                largest = v;

        return largest;
    }

    public static double mean(double [] array) {
        double sum = 0;

        // Use enhanced for loop
        // for each value v in array
        // for v in array:  # python
        for (double v : array)
            sum = sum + v;

        return sum / array.length;
    }

    public static void printdoubles(double [] array) {
        System.out.print('[');
        for (int i = 0; i < array.length - 1; i++)
            System.out.print(array[i] + ", ");
        System.out.print(array[array.length - 1]);
        System.out.println(']');
    }

}  // class MyArrays
