class Solution {
    public int maxDepth(String s) {
        int maxcnt=0;
        int cnt = 0;
        int l = s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='('){
                cnt +=1;
                if(maxcnt<cnt){
                    maxcnt=cnt;
                }
            }
            if(s.charAt(i)==')'){
                cnt -= 1;
            }
        }
        return maxcnt;
    }
}