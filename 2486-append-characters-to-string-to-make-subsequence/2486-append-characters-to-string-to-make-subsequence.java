class Solution {
    public int appendCharacters(String s, String t) {
        int m = 0;
        int n = 0;
        int o = s.length();
        int p = t.length();
        while(m<o && n<p){
            if(s.charAt(m)==t.charAt(n)){
                m++;
                n++;
            }
            else{
                m++;
            }
        }
        return p-n;
    }
}