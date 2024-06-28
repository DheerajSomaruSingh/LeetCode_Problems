class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long deg[] = new long[n];
        for(int edges[] : roads){
            deg[edges[0]]++;
            deg[edges[1]]++;
        }
        Arrays.sort(deg);
        long res = 0;
        long label = 1;
        for(int i=0;i<n;i++){
            res += (deg[i]*label);
            label++;
        }
        return res;
    }
}