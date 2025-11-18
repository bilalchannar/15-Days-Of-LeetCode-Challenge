class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;
        int[] last = new int[256];
        for (int i = 0; i < 256; i++) {
            last[i] = -1;
        }
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (last[c] >= left) {
                left = last[c] + 1;
            }
            last[c] = right;
            int window = right - left + 1;
            if (window > maxLen) {
                maxLen = window;
            }
        }

        return maxLen;
    }

}