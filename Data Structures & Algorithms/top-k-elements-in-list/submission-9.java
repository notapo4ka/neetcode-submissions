class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        return map.entrySet()
        .stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();
    }
}
