class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # find two numbers a and b in list 'nums' s.t a +b = target
        # index of a != index b => must be unique position but not unique number

        # look for complement in hashset i.e target = 7, a = 3, then complement = 4
        # use hashmap to hold each number and its index i
        # repeat until entire list iterated through or complement found then return index i and stored index

        # this approach would be O(n) space and O(n) time

        # 2 approach store oringinal num in key and index in val
        # then at each llookup i look for compliement of urrent or viceversa
        mem = {}

        for i,n in enumerate(nums):
            complement = target - n
            if complement in mem:
                return [mem[complement], i]
            
            mem[n]= i
        
        return [0,0]
        