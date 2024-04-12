class Solution {
    public int trap(int[] height) {
        //brute force(Better) 
        /*
        int n = height.length;int f = 0;int g = 0;int ans = 0;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        for(int i=0;i<n;i++){
            if(f<height[i]){
                f = height[i];
                leftmax[i] = f;
            }
            else{
                leftmax[i] = f;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(g<height[i]){
                g = height[i];
                rightmax[i] = g;
            }
            else{
                rightmax[i] = g;
            }
        }
        for(int i=0;i<n;i++){
            ans += Math.min(leftmax[i],rightmax[i]) - height[i];
        }
        */
        //optimal
        int n = height.length;int leftmax = 0;int rightmax = 0;int l = 0;int r = n-1;int ans = 0;
        while(l<r){
            if(leftmax<height[l]){
                leftmax = height[l];
            }
            if(rightmax<height[r]){
                rightmax = height[r];
            }
            if(leftmax<rightmax){
                ans+=leftmax - height[l];
                l++;
            }else{
                ans+=rightmax - height[r];
                r--;
            }
        }
        return ans;
    }
}