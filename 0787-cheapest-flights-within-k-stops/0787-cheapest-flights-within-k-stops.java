class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> gr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            gr.add(new ArrayList<>());
        }
        
        for (int[] e : flights) {
            gr.get(e[0]).add(new int[]{e[1], e[2]});
        }
        
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{src, 0}); // {node, dis}
        int stops = 0;
        
        while (stops <= k && !q.isEmpty()) {
            int sz = q.size();
            while (sz-- > 0) {
                int[] pair = q.poll();
                int node = pair[0];
                int distance = pair[1];
                for (int[] next : gr.get(node)) {
                    int neighbour = next[0];
                    int price = next[1];
                    if (price + distance >= dist[neighbour]) continue;
                    dist[neighbour] = price + distance;
                    q.offer(new int[]{neighbour, dist[neighbour]});
                }
            }
            stops++;
        }
        
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}
