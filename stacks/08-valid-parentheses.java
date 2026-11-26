package stacks;

import java.util.Stack;

class Main {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Test 1: " + isValid("()"));
        System.out.println("Test 2: " + isValid("()[]{}"));
        System.out.println("Test 3: " + isValid("(]"));
        System.out.println("Test 4: " + isValid("([)]"));
        System.out.println("Test 5: " + isValid("{[]}"));
        System.out.println("Test 6: " + isValid("("));
    }
}
