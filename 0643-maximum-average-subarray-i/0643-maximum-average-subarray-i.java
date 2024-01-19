class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double a=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            a+=nums[i];
        }
        double ans=a;
        for(int i=k;i<n;i++){
            a+=nums[i]-nums[i-k];
            ans=Math.max(a,ans);
        }
        return ans/k;
    }
}