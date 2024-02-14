class Solution {
    public boolean isValid(String s) {
        Stack<Character> open = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == '(' || c == '{' || c == '[') {
                open.push(c);
            } else if (!open.isEmpty() &&
                    (c == ')' && open.peek() == '(' ||
                     c == ']' && open.peek() == '[' ||
                     c == '}' && open.peek() == '{')) {
                open.pop();
            } else {
                return false; 
            }
        }
        return open.isEmpty(); 
    }
}
