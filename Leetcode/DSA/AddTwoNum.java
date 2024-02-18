class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
