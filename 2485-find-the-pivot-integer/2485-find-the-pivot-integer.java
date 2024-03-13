class Solution {
    public int pivotInteger(int n) {
        /*
         * int left = 1;
         * int right = n;
         * int leftsum = left;
         * int rightsum = right;
         * 
         * if(n==1)return n;
         * while(left < right){
         * if(leftsum<rightsum){
         * left++;
         * leftsum += left;
         * }
         * if(rightsum<leftsum){
         * right--;
         * rightsum += right;
         * }
         * if(leftsum == rightsum && left+1==right-1){
         * return left+1;
         * }
         * }
         * return -1;
         */
        int sum = (n * (n + 1)) / 2;
        double x = Math.sqrt(sum);
        if (Math.round(x) * Math.round(x) == sum) {
            return (int) Math.round(x);
        }
        return -1;
    }
}
