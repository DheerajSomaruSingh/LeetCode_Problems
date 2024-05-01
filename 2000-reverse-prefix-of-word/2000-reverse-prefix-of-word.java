class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int id = -1;
        StringBuilder st = new StringBuilder();
        for(int i=0;i<n;i++){
            if(word.charAt(i)==ch){
                id = i;
                break;
            }
        }
        if(id==-1){
            return word;
        }
        else{
            int id2 = id;
            while(id>-1){
                st.append(word.charAt(id));
                id--;
            }
            for(int i=id2+1;i<n;i++){
                st.append(word.charAt(i));
            }
            return st.toString();
        }
    }
}