class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] perm = new int[26];

        for (int i = 0; i<s1.length(); i++) {
            char c = s1.charAt(i);
            perm[c - 'a'] += 1;
        }

        int l = 0;
        int r = s1.length() - 1;
        System.out.print(l +":"+r);
        if (s1.length() > s2.length()) return false;

        int[] window = new int[26];
        for (int i = 0; i <=r; i++) window[s2.charAt(i) - 'a'] += 1;

        //now perm and initial window array set.

        System.out.println("perm: "+ Arrays.toString(perm));

        while (r < s2.length()-1) {
            System.out.println("window: "+ Arrays.toString(window));


            if (Arrays.equals(perm, window)) return true;

            window[s2.charAt(l++) - 'a'] -= 1;
            window[s2.charAt(++r) - 'a'] +=1;

        }

        return Arrays.equals(perm, window);
        
    }
}
