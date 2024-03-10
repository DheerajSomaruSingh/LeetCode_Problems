class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjls = new ArrayList<ArrayList<Integer>>();
        int n = isConnected.length;
        int v[] = new int[n + 1];

        for(int i=0;i<n;i++){
            adjls.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adjls.get(i).add(j);
                    adjls.get(j).add(i);
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == 0) {
                cnt++;
                dfs(i, adjls, v);
            }
        }
        return cnt;
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adjls, int[] v) {
        v[node] = 1;
        for (Integer it : adjls.get(node)) {
            if (v[it] == 0) {
                dfs(it, adjls, v);
            }
        }
    }
}