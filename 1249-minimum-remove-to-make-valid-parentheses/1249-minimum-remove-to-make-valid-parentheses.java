class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder t = new StringBuilder();
        int openbar = 0;
        int n = s.length();
        char ch;
        for(int i=0;i<n;i++){
            ch = s.charAt(i);
            if(ch=='('){
                openbar++;
                t.append(ch);
            }
            else if(ch==')'){
                if(openbar>0){
                    t.append(ch);
                    openbar--;
                }
                else{
                    continue;
                }
            }
            else{
                t.append(ch);
            }
        }
        //remove extra openbar
        n = t.length();
        for(int i=n-1;i>=0;i--){
            if(openbar==0)break;
            ch = t.charAt(i);
            if(ch=='('){
                t.deleteCharAt(i);
                openbar--;
            }
        }
        return t.toString();
    }
}