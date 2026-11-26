class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> pairs = new HashMap<>();
        for (int i = 0;i<nums.length;i++) {
            
            int recip = target - nums[i];
            if (pairs.containsKey(recip)) {
                return new int[] {pairs.get(recip), i};
            }

            pairs.put(nums[i],i);
        }
        return null;
    }
}
