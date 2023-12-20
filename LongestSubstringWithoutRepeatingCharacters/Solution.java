package LongestSubstringWithoutRepeatingCharacters;

class Solution {
    public int lengthOfLongestSubstring(String l) {
        int n = l.length();
        int maxLength = 0;
        int i = 0, j = 0;
        HashSet<Character> set = new HashSet<>();

        while (j < n) {
            if (!set.contains(l.charAt(j))) {
                set.add(l.charAt(j));
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            } else {
                set.remove(l.charAt(i));
                i++;
            }
        }

        return maxLength;
    }
}
