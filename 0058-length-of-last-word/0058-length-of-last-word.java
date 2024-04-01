class Solution {
    public int lengthOfLastWord(String s) {
        int cnt = 0;
        int n = s.length();
        
        // Traverse from the end of the string
        for (int i = n - 1; i >= 0; i--) {
            // If the current character is not a space, increment the count
            if (s.charAt(i) != ' ') {
                cnt++;
            } else {
                // If the current character is a space and we have already counted characters
                if (cnt > 0) {
                    // We found the last word, so break out of the loop
                    break;
                }
            }
        }
        
        return cnt;
    }
}