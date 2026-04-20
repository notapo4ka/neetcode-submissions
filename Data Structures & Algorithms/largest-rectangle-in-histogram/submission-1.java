class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int startIndex = i;
            
            while (!stack.isEmpty() && stack.peek()[1] > heights[i]) {
                int[] top = stack.pop();
                int topIndex = top[0];
                int topHeight = top[1];
                
                maxArea = Math.max(maxArea, topHeight * (i - topIndex));
                startIndex = topIndex;
            }
            stack.push(new int[]{startIndex, heights[i]});
        }
        
        for (int[] pair : stack) {
            int index = pair[0];
            int height = pair[1];
            
            maxArea = Math.max(maxArea, height * (heights.length - index));
        }
        
        return maxArea;
    }
}
