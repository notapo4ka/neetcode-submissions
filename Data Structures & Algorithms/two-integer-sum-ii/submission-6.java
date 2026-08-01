class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = 1;

        while (left < right) {
            int currentR = right;
            for (int i = right; i < numbers.length; i++) {
                if (numbers[left] + numbers[i] == target) {
                    return new int[]{left + 1, i + 1};
                }
                right++;
            }
            left++;
            right = currentR + 1;
        }
        return new int[]{};
    }
}
