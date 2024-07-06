class Solution {
    public int passThePillow(int n, int t) {
        boolean k = true;
        int f = 1;
        while(t>0){
            if(f==n){
                k = false;
            }
            if(f==1){
                k = true;
            }
            if(k==true){
                f++;
                t--;
            }
            if(k!=true){
                f--;
                t--;
            }
        }
        return f;
    }
}