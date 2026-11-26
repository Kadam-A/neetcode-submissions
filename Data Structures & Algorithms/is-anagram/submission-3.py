class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # given lower case letters
        # both s and t must have :1. equal # chars 2. same chars

        # use an array to hold number of chars in s then compare to t
        # each char seen in s + 1 in array position, then t -1 for each array position
        # then go through array at end to ensure clean array since s & t should revert array to 0's

        #create storage array
        char_store = [0] * 26 #hold char alphabet
        pos = ord('a')

        #populate s
        for c in s:
            char_store[ord(c) - pos]+=1

        #reset t
        for c in t:
            char_store[ord(c) - pos]-=1

        #anagram check
        for c in char_store:
            if c != 0:
                return False
            
        return True
        
        