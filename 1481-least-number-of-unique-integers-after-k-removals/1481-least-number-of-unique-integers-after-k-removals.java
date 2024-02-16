class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int[] frequencies = new int[mp.size()];
        int i = 0;
        for (int freq : mp.values()) {
            frequencies[i++] = freq;
        }
        Arrays.sort(frequencies);

        int uniqueCount = frequencies.length;
        for (int freq : frequencies) {
            if (k >= freq) {
                k -= freq;
                uniqueCount--;
            } else {
                break;
            }
        }

        return uniqueCount;
    }
}
