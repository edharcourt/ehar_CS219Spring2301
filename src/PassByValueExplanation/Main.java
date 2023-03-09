package PassByValueExplanation;

import Utility.MyArrays;

import java.util.Arrays;

public class Main {

    public static int f(int x, int [] array) {
        x = 99;
        array[2] = -23;
        return x;
    }

    public static void main(String[] args) {
        int y = 1;
        int [] array = new int [] {1, 2, 3, 4};
        System.out.println(f(y, array));
        System.out.println(y);
        System.out.println(
            Arrays.toString(array));
    }
}
