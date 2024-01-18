class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();

        for(String s : strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted_s = String.valueOf(charArr);
            if(!mp.containsKey(sorted_s)){
                mp.put(sorted_s,new ArrayList<>());
            }
            mp.get(sorted_s).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}