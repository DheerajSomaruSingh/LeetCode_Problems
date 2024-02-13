class Solution {
    public String firstPalindrome(String[] words) {
        boolean pal = false;
        for(int i=0;i<words.length;i++){
            if(words[i].length()==1){
                return words[i];
            }
            for(int j=0;j<words[i].length()/2;j++){
                if(words[i].charAt(j) == words[i].charAt(words[i].length()-j-1)){
                    pal = true;
                }
                else{
                    pal = false;
                    break;
                }
            }
            if(pal == true){
                return words[i];
            }
        }
        return "";
    }
}