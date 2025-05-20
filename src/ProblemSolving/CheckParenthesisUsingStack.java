package ProblemSolving;

import java.util.Stack;

public class CheckParenthesisUsingStack  {
    public static void main(String[] args) {
        System.out.println(checkParenthesis("({([])})")); // Example input
    }

    public static boolean checkParenthesis(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
