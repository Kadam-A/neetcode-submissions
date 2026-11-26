class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>  needed = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (needed.containsKey(nums[i])) {
                return new int[] {needed.get(nums[i]),i};
            }
            needed.put(target - nums[i], i);
        }
        return null;
    }
}
