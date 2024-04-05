class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder s1 = new StringBuilder();
        int n = s.length();
        for(int i = n - 1; i >= 0; i--) {
            if(st.isEmpty()) {
                st.push(s.charAt(i));
            } else {
                if(st.peek()!=s.charAt(i) && (st.peek() == Character.toUpperCase(s.charAt(i)) || Character.toUpperCase(st.peek()) == s.charAt(i))) {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }
        }
        while(!st.isEmpty()){
            s1.append(st.pop());
        }
        return s1.toString();
    }
}
