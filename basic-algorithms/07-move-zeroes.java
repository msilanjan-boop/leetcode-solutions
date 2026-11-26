
import java.util.Arrays;

class Main {
    static void moveZeroes(int[] nums) {
        int position = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[position] = nums[i];
                position++;
            }
        }

        while (position < nums.length) {
            nums[position] = 0;
            position++;
        }
    }

    public static void main(String[] args) {
        int[] test1 = {0, 1, 0, 3, 12};
        moveZeroes(test1);
        System.out.println("Test 1: " + Arrays.toString(test1));

        int[] test2 = {0, 0, 1};
        moveZeroes(test2);
        System.out.println("Test 2: " + Arrays.toString(test2));

        int[] test3 = {1, 2, 3};
        moveZeroes(test3);
        System.out.println("Test 3: " + Arrays.toString(test3));

        int[] test4 = {0, 0, 0};
        moveZeroes(test4);
        System.out.println("Test 4: " + Arrays.toString(test4));
    }
}
