class Solution {
    public int maxArea(int[] heights) {
        
        int maxArea = 0;
        int currentArea = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int leftHeight = heights[left];
            int rightHeight = heights[right];
            int minHeight = Math.min(leftHeight, rightHeight);

            currentArea = minHeight * (right - left);

            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
