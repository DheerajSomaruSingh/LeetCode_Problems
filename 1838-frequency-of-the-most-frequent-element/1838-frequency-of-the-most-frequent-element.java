class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxfreq = 0;
        long l = 0, r = 0, total = 0;
        int n = nums.length;
        for (r = 0; r < n; r++) {
            total += nums[(int) r];
            while (l + 1 <= r && (nums[(int) r] * (r - l + 1) > total + k)) {
                total -= nums[(int) l];
                l++;
            }
            maxfreq = Math.max(maxfreq, (int) (r - l + 1));
        }
        return maxfreq;
    }
}