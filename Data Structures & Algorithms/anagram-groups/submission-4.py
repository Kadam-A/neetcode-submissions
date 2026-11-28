class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        groups = defaultdict(list)

        for word in strs:

            rep = [0] *26
            for c in word:
                rep[ord(c) - ord('a')]+=1
            
            groups[tuple(rep)].append(word) #handles both never seen before aswell as adding to existin glist due to defaultdict
        
        return list(groups.values())
        