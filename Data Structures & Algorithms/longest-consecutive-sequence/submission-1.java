class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Set<Integer> numbers = new HashSet<>();
        List<Integer> lengths = new ArrayList<>();

        for (int n : nums) {
            numbers.add(n);
        }

        for (int num : nums) {
            if (!numbers.contains(num - 1)) {
                int length = 1;

                int current = num;
                while (numbers.contains(current + 1)) {
                    current++;
                    length++;
                }
                lengths.add(length);
            }
        }

        return Collections.max(lengths);
    }
}
