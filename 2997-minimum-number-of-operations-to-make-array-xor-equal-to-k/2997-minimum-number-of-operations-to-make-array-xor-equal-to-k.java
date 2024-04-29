class Solution {
    public int minOperations(int[] nums, int k) {
        int finalxor = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            finalxor = finalxor^nums[i];
        }

        int cnt = 0;
        while(k>0 || finalxor>0){
            if(k%2 != finalxor%2){
                cnt++;
            }
            k = k/2;
            finalxor = finalxor/2;
        }
        return cnt;
    }
}