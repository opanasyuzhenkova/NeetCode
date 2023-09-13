package stack;

import java.util.Deque;
import java.util.LinkedList;

class validParentheses {
    public static boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !isPair(stack.pollFirst(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');

    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
