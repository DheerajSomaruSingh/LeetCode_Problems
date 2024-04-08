class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        /*
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new LinkedList<>();
        int m = students.length;
        int l = sandwiches.length;
        int n = 0;
        for(int i=0;i<m;i++){
            q.add(students[i]);
        }
        while(!q.isEmpty()){
            if(sandwiches[n] == q.peek()){
                q.poll();
                n++;
                if(!q1.isEmpty()){
                    while(!q1.isEmpty()){
                        q.add(q1.poll());
                    }
                }
            }
            else{
                q1.add(q.poll());
            }
        }
        return l - n;
        */
        int[] cnt = new int[2];
        for(int s : students){
            cnt[s]++;
        }
        int remaining = sandwiches.length;
        for(int sandwich : sandwiches){
            if (cnt[sandwich] == 0) break;
            if (remaining-- == 0) break;
            cnt[sandwich]--;
        }
        return remaining;
    }
}

