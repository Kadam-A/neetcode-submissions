class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //given array ascending order
        // give index + 1

        int l = 0, r = numbers.length - 1;
        while (l < r) {

            // int rep = target - numbers[l];
            int res = numbers[l] + numbers[r];

            if (res == target) return new int[] {l+1,r+1};

            if (res < target) {
                l++; 
                continue;
            }
            if (res > target) {
                r--; 
                continue;
            }


        }
        return null;
    }
}
