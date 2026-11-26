class Solution {
    public int characterReplacement(String s, int k) {

        // Set<Character> window = new HashSet<>();
        int[] counts = new int[26];
        int l = 0;
        // window.add(s.charAt(l));
        if (s.length() == 0) return 0;
        counts[s.charAt(l) - 'A']++;
        System.out.println("counts:" + Arrays.toString(counts));
        int longest = 1;
        
        for (int r = l+1; r<s.length(); r++) {

            char c = s.charAt(r);
            // window.add(c);
            counts[c - 'A']++;

            int maxChar = 0;
            int replace = 0;
            for (int i = 0; i<26; i++) {
                maxChar = Math.max(counts[i],maxChar);
            }
            
            replace = (r - l + 1) - maxChar;
            System.out.println("replace:" + replace);
            if (replace > k) {
                //not valid k
                longest = Math.max(longest, r - l);
                System.out.println("l:" + l);
                counts[s.charAt(l++) - 'A']--;
            } 
            longest = Math.max(longest, r - l + 1);
            System.out.println("counts:" + Arrays.toString(counts));
            System.out.println("longest:" + longest);
        }
        return longest;
        
    }
}
