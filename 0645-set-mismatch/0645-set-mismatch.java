class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length];
        int[] result = new int[2];

        // Loop through each element in the 'nums' array
        for (int i : nums) {
            // Increment the count of occurrences of each element in 'arr'
            arr[i - 1]++;
        }

        // Check 'arr' to find the duplicate and missing numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                result[0] = i + 1;  // Duplicate number
            }
            if (arr[i] == 0) {
                result[1] = i + 1;  // Missing number
            }
        }

        return result;
    }
}

