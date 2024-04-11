class Solution {
    public void sortColors(int[] nums) {
        //brute force
        //Arrays.sort(nums);
        
        //better
        int n= nums.length;
        int[] cnt = new int[3];
        for(int i=0;i<n;i++){
            cnt[nums[i]]++;
        }
        int i=0;
        int j=0;
        int k = cnt.length;
        while(j<n){
            if(cnt[i]>0 && i<k){
                nums[j] = i;
                cnt[i]--;
                j++;
            }
            else{
                i++;
            }
            
        }
    }
}