class Solution {
    public int longestIdealString(String s, int k) {
        int n = s.length();
        int[][] dp = new int[n][27];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return getMaxLenSubSeq(s, 0, k, '{', dp);
    }

    public int getMaxLenSubSeq(String s, int index, int k, char lastChar, int[][] dp) {
        if (index >= s.length()) {
            return 0;
        }

        if (dp[index][lastChar - 'a'] != -1) {
            return dp[index][lastChar - 'a'];
        }

        int pick = 0;
        char currentChar = s.charAt(index);
        int diff = Math.abs((int) lastChar - (int) currentChar);
        if (lastChar == '{' || diff <= k) {
            pick = 1 + getMaxLenSubSeq(s, index + 1, k, currentChar, dp);
        }

        int nonpick = getMaxLenSubSeq(s, index + 1, k, lastChar, dp);
        return dp[index][lastChar - 'a'] = Math.max(pick, nonpick);
    }
}