package ImpCoding;

import java.util.Stack;

class BalanceParan {
    public static void main(String[] args) {
        String val = "[()]";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < val.length(); i++) {
            if (val.charAt(i) == '{' || val.charAt(i) == '[' || val.charAt(i) == '(') {
                st.push(val.charAt(i));
            } else if (!st.empty() && ((val.charAt(i) == ']' && st.peek() == '[')
                    || (val.charAt(i) == '}' && st.peek() == '{') || (val.charAt(i) == ')' && st.peek() == '('))) {
                st.pop();
            } else {
                st.push(val.charAt(i));
            }
        }
        if (st.empty())
            System.out.println("balamced");
        else
            System.out.println("not");
    }
}