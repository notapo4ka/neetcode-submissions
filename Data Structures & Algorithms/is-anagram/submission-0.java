class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            sMap.merge(c, 1, Integer::sum);
        }

        for (char c : t.toCharArray()) {
            tMap.merge(c, 1, Integer::sum);
        }
        
        return sMap.equals(tMap);
    }
}
