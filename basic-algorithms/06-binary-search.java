
class Main {
    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] test1 = {-1, 0, 3, 5, 9, 12};
        System.out.println("Test 1: " + search(test1, 9));

        int[] test2 = {-1, 0, 3, 5, 9, 12};
        System.out.println("Test 2: " + search(test2, 2));

        int[] test3 = {5};
        System.out.println("Test 3: " + search(test3, 5));

        int[] test4 = {1, 3, 5, 7, 9};
        System.out.println("Test 4: " + search(test4, 1));
    }
}
