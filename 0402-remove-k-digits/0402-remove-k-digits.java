class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && k>0 && ch<st.peek()){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        StringBuilder s = new StringBuilder();
        while(!st.isEmpty()){
            if(k>0){
                st.pop();
                k--;
            }
            else{
                s.insert(0,st.pop());
            }
        }
        while(s.length()>0 && s.charAt(0)=='0'){
            s.deleteCharAt(0);
        }
        if(s.length()==0){
            return "0";
        }
        else{
            return s.toString();
        }
    }
}