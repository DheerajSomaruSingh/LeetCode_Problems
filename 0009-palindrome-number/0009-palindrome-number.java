class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        else{
            int l=x;
            int k=0;
            while(x>0){
                k = (k*10)+(x%10);
                x = x/10;
            }
            if(l==k){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
}