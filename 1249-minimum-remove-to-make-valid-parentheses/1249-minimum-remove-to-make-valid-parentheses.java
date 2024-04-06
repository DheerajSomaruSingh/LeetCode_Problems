class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || (s.charAt(i) == ')' && st.isEmpty())) {
                st.push(i);
            } else if (s.charAt(i) == ')') {
                if (!st.isEmpty() && s.charAt(st.peek()) == '(') {
                    st.pop();
                } else {
                    st.push(i);
                }
            }

        }
        StringBuilder t = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && st.peek() == i) {
                st.pop();
            } else {
                t.insert(0, ch);
            }

        }
        return t.toString();
    }
}