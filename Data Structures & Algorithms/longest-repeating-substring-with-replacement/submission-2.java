class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLength = 0;
        HashMap<Character, Integer> frequency = new HashMap<>();

        int maxFrequency = 0;
        int windowSize = 0;
        for (int right = 0; right < s.length(); right++) {
            frequency.merge(s.charAt(right), 1, Integer::sum);
            maxFrequency = Math.max(maxFrequency, frequency.get(s.charAt(right)));
            windowSize = right - left + 1;

            if (windowSize - maxFrequency <= k) {
                maxLength = Math.max(maxLength, windowSize);
            } else {
                int count = frequency.get(s.charAt(left));
                frequency.remove(s.charAt(left));
                frequency.put(s.charAt(left), count - 1);
                left++;
            }
        }

        return maxLength;
    }
}
