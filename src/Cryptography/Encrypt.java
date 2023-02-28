package Cryptography;

public class Encrypt {

    // Symmetric cryptography, sender and receiver
    // use a shared key.

    public static String E(String clear, int key) {
        String cipher = "";

        for (int i = 0; i < clear.length(); i++) {
            char clear_char = clear.charAt(i);
            int clear_char_pos = clear_char - 'a';
            int cipher_char_pos =
                Math.floorMod(clear_char_pos + key, 26);
            char cipher_char = (char) (cipher_char_pos + 'a');
            cipher = cipher + cipher_char;
        }
        return cipher;
    }

    public static void main(String[] args) {
        System.out.println(
            E("hello", 0).equals("hello"));
        System.out.println(E("hello", 1).equals("ifmmp"));
        System.out.println(E("hello", 26).equals("hello"));

        String t = E("attackatdawn", 13);
        System.out.println(t);
        System.out.println(E(t,-13));

    }


}
