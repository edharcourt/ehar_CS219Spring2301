package Utility;

import java.util.Arrays;

public class MyArrays {

    public static int indexOf(int [] values,
                              int key) {
        for (int i = 0; i < values.length; i++)
            if (values[i] == key)
                return i;

        return -1;
    }

    // shift all of the values in the array
    // start at index i
    // left, by one place, filling in the last
    // value as zero.
    public static int [] shift(int [] values, int i) {
        for (int j = i; j < values.length - 1; j++)
            values[j] = values[j+1];

        values[values.length - 1] = 0;
        return values;
    }

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

    public static void main(String[] args) {
        // run some tests
        int [] array = {4, 7, 6, 9, 1, 7};
        System.out.println(indexOf(array, 9) == 3);
        System.out.println(indexOf(array, 43) == -1);
        System.out.println(indexOf(array, 7) == 1);

        shift(array, 2);
        System.out.println(Arrays.toString(array).
          equals(Arrays.toString(new int [] {4,7,9,1,7,0})));

        System.out.println(
            Arrays.compare(array,new int [] {4,7,9,1,7,0}) == 0);
    }

}  // class MyArrays
