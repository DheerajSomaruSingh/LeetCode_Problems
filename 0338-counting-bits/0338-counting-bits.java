class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0]=0;
        if(n==0){
            return arr;
        }
        for(int i=1;i<=n;i++){
            int k=i;
            int count = 0;
            int r=0;
            while(k>0){
                r = k%2;
                k=k/2;
                if(r==1){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}