class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (numbers.containsKey(diff)) {
                int diffIndex = numbers.get(diff);
                return new int[]{diffIndex, i};
            } 

            numbers.put(nums[i], i);
        }
        return new int[0];
    }
}
