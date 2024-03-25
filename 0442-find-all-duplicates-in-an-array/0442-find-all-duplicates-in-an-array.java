class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = nums.length;
        //Brute Force Space - O(1)
        /*
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                al.add(nums[i]);
            }
            set.add(nums[i]);
        }
        */
        //optimal  space --------- O(1)
        for(int i=0;i<n;i++){
            int num = Math.abs(nums[i]);
            int idx = num-1;
            if(nums[idx]<0){
                al.add(num);
            }
            nums[idx] *= -1;
        }
        return al;

    }
}