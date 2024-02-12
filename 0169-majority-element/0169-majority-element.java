class Solution {
    public int majorityElement(int[] nums) {
        int p=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                p = nums[i];
                count++;
            }
            else if(p==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        if(count>0){
            return p;
        }
        return -1;
    }
}