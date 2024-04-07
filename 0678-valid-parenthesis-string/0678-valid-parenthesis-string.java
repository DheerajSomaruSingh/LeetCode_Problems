class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openBracket = new Stack<>();
        Stack<Integer> asterisk = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                openBracket.push(i);
            } else if (ch == '*') {
                asterisk.push(i);
            } else if (ch == ')') {
                if (!openBracket.isEmpty()) {
                    openBracket.pop();
                } else if (!asterisk.isEmpty()) {
                    asterisk.pop();
                } else {
                    return false; // No matching open bracket or asterisk
                }
            }
        }
        
        while (!openBracket.isEmpty()) {
            if (asterisk.isEmpty()) {
                return false; // No matching asterisk for open bracket
            }
            if (openBracket.pop() > asterisk.pop()) {
                return false; // The open bracket is after the asterisk
            }
        }
        
        return openBracket.isEmpty();
    }
}
