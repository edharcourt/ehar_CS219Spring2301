package Cryptography;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Encrypt {

    // Symmetric cryptography, sender and receiver
    // use a shared key.

    public static String E(String clear, int key, boolean enc) {
        String cipher = "";

        SecureRandom rng = null;
        try {
            rng = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: could not create random number generator");
            System.exit(1);  // stop the Java program
        }

        rng.setSeed(key);
        final int alpha_length = '~' - ' ' + 1;
        final char base_char = ' ';

        for (int i = 0; i < clear.length(); i++) {
            char clear_char = clear.charAt(i);
            int clear_char_pos = clear_char - base_char;
            int r = rng.nextInt();
            if (!enc) r = -r;
            int cipher_char_pos =
                Math.floorMod(clear_char_pos + r, alpha_length);
            char cipher_char = (char) (cipher_char_pos + base_char);
            cipher = cipher + cipher_char;
        }
        return cipher;
    }

    public static void main(String[] args) {
//        System.out.println(
//            E("hello", 0).equals("hello"));
//        System.out.println(E("hello", 1).equals("ifmmp"));
//        System.out.println(E("hello", 26).equals("hello"));
//
//        String t = E("attackatdawn", 13);
//        System.out.println(t);
//        System.out.println(E(t,-13));

        System.out.println(E("Attack! at dawn :-)", 99, true));
        System.out.println(E("wHm;%7;Y@:2AB3}!`D7", 99, false));

    }


}
