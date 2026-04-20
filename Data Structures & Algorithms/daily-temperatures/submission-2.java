class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;

        int[] result = new int[n];
        Arrays.fill(result, 0);
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek()[0]) {
                int[] popElement = stack.pop();
                result[popElement[1]] = i - popElement[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return result;
    }
}
