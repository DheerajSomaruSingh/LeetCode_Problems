class Solution {
    public int longestPalindrome(String s) {
        // Use an array to count character frequencies, assuming ASCII characters
        int[] set = new int[128];
        int res = 0;
        int oddCount = 0;
        
        // Count the frequency of each character
        for (char ch : s.toCharArray()) {
            set[ch]++;
        }
        
        // Calculate the length of the longest palindrome
        for (int count : set) {
            if (count % 2 == 0) {
                res += count;
            } else {
                res += count - 1; // Add the even part of the odd count
                oddCount++;
            }
        }
        
        // If there's any character with an odd count, we can add one character to the center of the palindrome
        if (oddCount > 0) {
            res++;
        }
        
        return res;
    }
}
