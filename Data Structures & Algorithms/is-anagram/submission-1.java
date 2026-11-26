class Solution {
    public boolean isAnagram(String s, String t) {

        int[] seen = new int[26];
        if (s.length() != t.length()) return false;

        for (char c : s.toCharArray()){
            int pos = c - 'a';
            seen[pos] += 1;
        }
        for (char c : t.toCharArray()){
            int pos = c - 'a';
            seen[pos] -= 1;

        }

        for (int i : seen) {
            if (i != 0) return false;
        }
        return true;
    }
}
