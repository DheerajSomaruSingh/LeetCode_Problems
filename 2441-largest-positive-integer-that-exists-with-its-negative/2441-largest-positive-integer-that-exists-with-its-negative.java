class Solution {
    public int findMaxK(int[] nums) {
        int max = 0;
        HashSet<Integer> st = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(st.contains(nums[i]*-1)){
                if(Math.abs(nums[i])>max){
                    max = Math.abs(nums[i]);
                }
            }
            st.add(nums[i]);
        }
        if(max==0){
            return -1;
        }
        else{
            return max;
        }
    }
}