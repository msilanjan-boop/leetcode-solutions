
import java.util.Arrays;

class Main {

    static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15};
        System.out.println("Test 1: " +
            Arrays.toString(twoSum(nums1, 9)));

        int[] nums2 = {3, 2, 4};
        System.out.println("Test 2: " +
            Arrays.toString(twoSum(nums2, 6)));

        int[] nums3 = {3, 3};
        System.out.println("Test 3: " +
            Arrays.toString(twoSum(nums3, 6)));
    }
}
