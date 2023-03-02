package Cryptography;

public class ModularPlay {

    public static void main(String[] args) {
        System.out.println(2 % 10 == 2);
        System.out.println(-2 % 10);
        System.out.println(-1/2);

        System.out.println(Math.floorMod(-15,12));
        System.out.println(Math.floorDiv(-15,12));

        System.out.println(13 % 3 == 1);
        System.out.println(-13 % 3 == -1);
        System.out.println(13 % -3 == 1);
        System.out.println(-13 % -3 == -1);
        System.out.println(Math.floorMod(13,3) == 1);
        System.out.println(Math.floorMod(-13,3) == 2);
        System.out.println(Math.floorMod(13,-3) == -2);
        System.out.println(Math.floorMod(-13,-3) == -1);

    }

}
