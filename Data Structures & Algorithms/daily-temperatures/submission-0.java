class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length - 1; i++) {
            int currentEl = temperatures[i];
            int index = 0;

            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[j] > currentEl) {
                    index = j;
                    break;
                }
            }
            result[i] = index == 0 ? 0 : index - i;
        }

        return result;
    }
}
