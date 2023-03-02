package Cryptography;

import java.util.Random;

public class ModularPlay {

    public static void main(String[] args) {
//        System.out.println(2 % 10 == 2);
//        System.out.println(-2 % 10);
//        System.out.println(-1/2);
//
//        System.out.println(Math.floorMod(-15,12));
//        System.out.println(Math.floorDiv(-15,12));

        Random rng = new Random();
        rng.setSeed(42);
        for (int i = 0; i < 5; i++) {
            System.out.println(rng.nextInt(26));
        }

    }

}
