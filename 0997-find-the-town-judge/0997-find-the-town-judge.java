class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1){
            return 1;
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<trust.length;i++){
            mp.put(trust[i][1],mp.getOrDefault(trust[i][1],0)+1);
        }
        for(int i=0;i<trust.length;i++){
            set.add(trust[i][0]);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()==n-1 && !set.contains(entry.getKey())){
                return entry.getKey();
            }
        }
        return -1;
    }
}