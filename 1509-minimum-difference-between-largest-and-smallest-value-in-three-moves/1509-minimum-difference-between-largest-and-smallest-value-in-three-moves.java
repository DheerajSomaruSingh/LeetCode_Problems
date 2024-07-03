class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        int resu = 0;
        if(n<=3){
            return 0;
        }
        else{
            Arrays.sort(nums);
            int res = Integer.MAX_VALUE;
            //CASE 1
            res = Math.min(res,nums[n-4]-nums[0]);
            //CASE 2
            res = Math.min(res,nums[n-3]-nums[1]);
            //case 3
            res = Math.min(res,nums[n-2]-nums[2]);
            //case 4
            res = Math.min(res,nums[n-1]-nums[3]);

            resu = res;
        }
        return resu;
    }
}