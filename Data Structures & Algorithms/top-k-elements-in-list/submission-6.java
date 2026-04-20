class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
        }

        List<int[]> frequency = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            frequency.add(new int [] {entry.getValue(), entry.getKey()});
        }
        frequency.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = frequency.get(i)[1];
        }

        return result;
    }
}
