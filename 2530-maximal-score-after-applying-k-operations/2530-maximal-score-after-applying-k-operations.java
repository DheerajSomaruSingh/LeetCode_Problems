class Solution {
    public long maxKelements(int[] nums, int k) {
        long res = 0;  // Change to long to avoid overflow
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : nums) {
            pq.add(i);
        }

        while (k > 0) {
            int s = pq.poll();
            res += s;
            s = (int) Math.ceil(s / 3.0);  // Use 3.0 to ensure floating-point division
            pq.add(s);
            k--;
        }
        return res;
    }
}
