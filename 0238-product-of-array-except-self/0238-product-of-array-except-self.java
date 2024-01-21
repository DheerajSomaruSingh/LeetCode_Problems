class Solution {
    public int[] productExceptSelf(int[] nums) {
        int nl = nums.length;
        int prefix = 1;
        int suffix = 1;
        int[] result = new int[nl];
        for(int i=0;i<nums.length;i++){
            result[i] = prefix;
            prefix *=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
    }
}