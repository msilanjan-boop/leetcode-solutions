
import java.util.Arrays;

class Main {

    static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        System.out.println("Test 1: " +
            isAnagram("listen", "silent"));

        System.out.println("Test 2: " +
            isAnagram("rat", "car"));

        System.out.println("Test 3: " +
            isAnagram("a", "a"));

        System.out.println("Test 4: " +
            isAnagram("ab", "a"));
    }
}
