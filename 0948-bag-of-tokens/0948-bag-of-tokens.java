class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int maxscore = 0;
        int score = 0;
        int i = 0;
        int j = tokens.length-1;
        while(i<=j){
            if(power>=tokens[i]){
                power = power - tokens[i];
                i++;
                score++;
                maxscore = Math.max(maxscore,score);
            }
            else if(score>0){
                power = power + tokens[j];
                j--;
                score--;
            }
            else{
                break;
            }
        }
        return maxscore;
    }
}