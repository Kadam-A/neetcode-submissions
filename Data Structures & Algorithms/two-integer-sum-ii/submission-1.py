class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        
        num_to_idx = {}

        for i in range(len(numbers)):
            x = numbers[i];
            comp = target - x;
            if comp in num_to_idx:
                return [num_to_idx[comp]+1,i+1];
            num_to_idx[x]= i;
            
        