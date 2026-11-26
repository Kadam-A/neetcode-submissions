class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();

        int l = 0, r = l+1;
        int longest = 0;

        if (s.length() == 0) return 0;
        else if (s.length() == 1) return 1;

        seen.add(s.charAt(l));

        while (l<r && r < s.length()) {

            if (seen.contains(s.charAt(r))) {
                longest = Math.max(longest, seen.size());
                //move left pointer and chnage window size depending on position
                while (s.charAt(l) != s.charAt(r)) {
                    seen.remove(s.charAt(l)); //decreasing window size
                    l++;
                } 
                l++; //move off same element
                seen.add(s.charAt(r));
                r++;
            } else {
                seen.add(s.charAt(r));
                r++;
            }

        }

        return Math.max(longest, seen.size());
    }
}
