class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int res = 1;
            for (int j = 0; j < nums.length;  j++) {

            if (j == i) {
                continue;
            }
            res *= nums[j];
            }
            result[i] = res;
        }
        return result;
    }
}  
