class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        unique = set()
        for num in nums:
            print(num)
            if num not in unique:
                print('true',num)
                unique.add(num)
            else:
                print('false',num)
                return True
        
        return False


        