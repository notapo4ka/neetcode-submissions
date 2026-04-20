class Solution {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> numbers = new HashSet<>();

        for (int n : nums) {
            numbers.add(n);
        }

        int maxLength = 0;
        for (int num : numbers) {
            if (!numbers.contains(num - 1)) {
                int length = 1;

                int current = num;
                while (numbers.contains(current + 1)) {
                    current++;
                    length++;
                }

                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        return maxLength;
    }
}
