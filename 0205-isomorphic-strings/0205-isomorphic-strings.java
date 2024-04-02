class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<>();
        HashMap<Character, Boolean> pm = new HashMap<>();
        int n = s.length();
        int m = t.length();
        for (int i = 0; i < n; i++) {
            if (!mp.containsKey(s.charAt(i))) {
                if (pm.containsKey(t.charAt(i))) {
                    return false;
                }
                mp.put(s.charAt(i), t.charAt(i));
                pm.put(t.charAt(i), true);
            } else {
                if(mp.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}