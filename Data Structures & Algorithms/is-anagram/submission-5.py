class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # given lower case letters
        # both s and t must have :1. equal # chars 2. same chars

        # use an array to hold number of chars in s then compare to t
        # each char seen in s + 1 in array position, then t -1 for each array position
        # then go through array at end to ensure clean array since s & t should revert array to 0's

        #edge case
        if len(s) != len(t):
            return False

        #create storage array
        char_store = [0] * 26 #hold char alphabet
        offset = ord('a')

        #populate s
        for c in s:
            char_store[ord(c) - offset]+=1

        #check
        for c in t:
            if char_store[ord(c) - offset] == 0:
                return False
            else:
               char_store[ord(c) - offset]-=1

        return True

        # space complexity is constant due to alphabet size O(1)
        # time complexity is O(2N) => O(N) 

        