class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        /*
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.isEmpty()){
                set.add(nums[i]);
            }
            else if(set.contains(nums[i])){
                return nums[i];
            }
            else{
                set.add(nums[i]);
            }
        }
        return -1;
        */
        boolean[] ass = new boolean[n+1];
        for(int i=0;i<n;i++){
            if(ass[nums[i]]){
                return nums[i];
            }
            ass[nums[i]] = true;
        }
        return -1;
    }
}