class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> uniqNums = new HashSet<>();

        for (int i = 0; i < nums.length ; i++) {
            if( uniqNums.contains(nums[i])) return true;
            uniqNums.add(nums[i]);
        }

        return false;
    }
}
