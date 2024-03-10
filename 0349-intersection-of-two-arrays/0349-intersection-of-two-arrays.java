class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums1) {
            set.add(i);
        }

        // Create a new Hashset to store the intersection
        HashSet<Integer> intersectionList = new HashSet<>();
        for (int i : nums2) {// Loop through the second array
            if (set.contains(i))
                intersectionList.add(i);// check that element in array 2 are present in hashset. if exists then added to
                                        // the 'intersectionList' hashset.
        }
        // Now final task is to store hashset value to array
        int[] resultList = new int[intersectionList.size()];
        int index = 0;
        for (int i : intersectionList) {
            resultList[index++] = i;
        }
        return resultList;
    }
}