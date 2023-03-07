package HW5;

public class Exercise65_66 {

    public static boolean isDoubloon(String s) {

        return true;
    }

    public static boolean canSpell(String word, String tiles) {
        return false; // squelch error message about no return statement
    }

    public static void main(String[] args) {

        System.out.println(isDoubloon("Abba"));
        System.out.println(isDoubloon("appeases"));
        System.out.println(isDoubloon("esophagographers"));

        // Negative tests
        System.out.println(!isDoubloon("esophagographer"));
        System.out.println(!isDoubloon("bananab"));
        System.out.println(!isDoubloon("applesauce"));

        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));

        // Student: add more test cases including negative tests.
        // All tests should print true if the test passes.

    } // main

} // class Exercise66
