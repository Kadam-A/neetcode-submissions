class Solution {
    public boolean isPalindrome(String s) {
        char[] phrase = s.toLowerCase().toCharArray();

        int i = 0;
        int j = phrase.length - 1;
        while (i < j) {
            


            //skip not alphanum chars

            if ( !Character.isLetterOrDigit(phrase[i]) ) {
                i++;
                continue;
            }
            if ( !Character.isLetterOrDigit(phrase[j]) ) {
                j--;
                continue;
            }

            if (phrase [i] != phrase[j]) return false;
            else {
                i++;
                j--;
            }
            

        }
        return true;
    }
}
