class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int cnt = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                cnt++;
            }
            if(arr[i]%2==0){
                cnt=0;
            }
            if(cnt==3){
                return true;
            }
        }
        return false;
    }
}