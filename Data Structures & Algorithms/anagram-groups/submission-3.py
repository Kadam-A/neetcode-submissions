class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # 1: need to determine a word is an anagram of another
        # 2. must be fast to look up
        # 3. since anagrams hold same amount of each letter
        # -> use that to create a group anagram representative?
        # -> have group rep: list of anagrams in each group -> hashmap (rep:list[anagrams])

        # iterate through each string
        # construct representative and check if in map,
        # if true add to existing list, if false create list and add rep key
        # this implies all anagram groups willl have same rep thus -> can find key in O(1) time
        # time taken to check if anagram? -> len(str) = k k * n => O(n) time complexity

        # how to determine anagram rep?
        # act, cat, tac
        # 1a1c1t => must be alphabetical?
        # also possible if sort string they all match but then woudl take klogk * n => O(logn) time compleixty


        groups = {}
        for word in strs:
            rep = "".join(sorted(word))
            # print("word:",word,"rep:",rep)
            if rep not in groups:
                groups[rep] = []
            groups[rep].append(word)   

        output = []
        for val in groups.values():
            output.append(val)

        return output     
                
