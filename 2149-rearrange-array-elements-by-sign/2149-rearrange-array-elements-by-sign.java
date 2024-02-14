class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] sol = new int[nums.length];
        int pos_count = 0;
        int neg_count = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                sol[pos_count] = nums[i];
                pos_count = pos_count + 2;
            }
            else{
                sol[neg_count] = nums[i];
                neg_count = neg_count + 2;
            }
        }
        return sol;
    }
}