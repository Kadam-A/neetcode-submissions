class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> compIndex = new HashMap<>();
        int comp = 0;

        for (int i = 0; i<nums.length; i++) {

            if ( compIndex.containsKey(nums[i]) ) return new int[]{compIndex.get(nums[i]),i};

            comp = target - nums[i];
            compIndex.put(comp,i);
        }


        return null;
    }
}
