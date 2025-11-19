class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] array = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            array[c - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            array[c - 'a']--;
            if (array[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}