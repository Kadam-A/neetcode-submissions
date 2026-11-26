class Solution {
    public int[] productExceptSelf(int[] nums) {
        //method 1;

        int prod = 1;
        for (int i = 0; i<nums.length; i++) {
            prod *= nums[i];
        }

        int[] arr = new int[nums.length];

        for (int i = 0; i<nums.length; i++) {


            if (nums[i] == 0) {
                arr[i] = 1;
               for (int j = 0; j<nums.length; j++) {
                    if (j == i) continue;
                    arr[i] *= nums[j];
                    System.out.println(arr[i]);
                }

            }
            else arr[i] = prod / nums[i];
        }

        return arr;
    }
}  
