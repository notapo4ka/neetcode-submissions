class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];

        int currentMaxLeft = 0;
        for (int i = left; i < right; i++) {
            maxLeft[i] = currentMaxLeft;
            currentMaxLeft = Math.max(currentMaxLeft, height[i]);
        }

        int currentMaxRight = 0;
        for (int i = right; i >= left; i--) {
            maxRight[i] = currentMaxRight;
            currentMaxRight = Math.max(currentMaxRight, height[i]);
        }

        

        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            int minHeight = Math.min(maxLeft[i], maxRight[i]);

            maxArea += Math.max(0, minHeight - height[i]);
        }
        return maxArea;
    }
}
