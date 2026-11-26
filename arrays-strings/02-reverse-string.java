
import java.util.Arrays;

class Main {

    static void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        char[] test1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(test1);
        System.out.println("Test 1: " + Arrays.toString(test1));

        char[] test2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(test2);
        System.out.println("Test 2: " + Arrays.toString(test2));

        char[] test3 = {'a'};
        reverseString(test3);
        System.out.println("Test 3: " + Arrays.toString(test3));
    }
}
