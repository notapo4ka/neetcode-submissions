class Solution {
    public int maxArea(int[] heights) {
        
        int maxArea = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int leftHeight = heights[left];
            int rightHeight = heights[right];
            int minHeight = Math.min(leftHeight, rightHeight);

            maxArea = Math.max(maxArea, minHeight * (right - left));

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
