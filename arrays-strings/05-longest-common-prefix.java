
class Main {

    static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] test1 = {"flower", "flow", "flight"};
        System.out.println("Test 1: " + longestCommonPrefix(test1));

        String[] test2 = {"dog", "racecar", "car"};
        System.out.println("Test 2: " + longestCommonPrefix(test2));

        String[] test3 = {"apple", "application", "apply"};
        System.out.println("Test 3: " + longestCommonPrefix(test3));

        String[] test4 = {"abc"};
        System.out.println("Test 4: " + longestCommonPrefix(test4));
    }
}
